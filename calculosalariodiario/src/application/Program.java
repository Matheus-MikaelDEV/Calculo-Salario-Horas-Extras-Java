package application;

import entities.WorkingDay;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu salário? ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Quantos dias você trabalha? ");
        int daysWorked = sc.nextInt();
        sc.nextLine();
        System.out.print("Você trabalhou quantas horas hoje?(hh:mm) ");
        String timeWorked = sc.nextLine();
        LocalTime workedTime = LocalTime.parse(timeWorked);

        WorkingDay workingDay = new WorkingDay(salary, daysWorked, workedTime);

        LocalDate today = LocalDate.now();

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.printf("Salário por dia: R$%.2f\nExtras: R$%.2f\nSalário com extras: R$%.2f", workingDay.getSalaryPerDay(), workingDay.getExtraDay(), workingDay.getSalaryPerDay() + workingDay.getExtraDay());

        sc.close();
    }
}
