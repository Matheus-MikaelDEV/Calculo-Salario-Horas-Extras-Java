package entities;

import java.time.Duration;
import java.time.LocalTime;

public class WorkingDay {
    private double salary;
    private int daysWorked;
    private double salaryPerDay;
    private LocalTime workedTime;
    private double extraDay;

    public WorkingDay(double salary, int daysWorked, LocalTime workedTime) {
        this.salary = salary;
        this.daysWorked = daysWorked;
        this.workedTime = workedTime;
    }

    public double getSalaryPerDay() {
        return salary / daysWorked;
    }

    public double getExtraDay() {
        LocalTime standardJourney = LocalTime.of(8, 0);

        Duration worked = Duration.between(LocalTime.MIDNIGHT, workedTime);
        Duration standard = Duration.between(LocalTime.MIDNIGHT, standardJourney);

        if (worked.compareTo(standard) > 0) {
            Duration extra = worked.minus(standard);
            extraDay = (extra.toMinutes() / 60.0) * (getSalaryPerDay() / 8.0);
        } else {
            extraDay = 0.0;
        }

        return extraDay;
    }
}
