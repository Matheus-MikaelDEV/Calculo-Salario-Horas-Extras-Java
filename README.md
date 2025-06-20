# Cálculo de Salário com Horas Extras

Este projeto em Java realiza o cálculo do salário diário de um trabalhador, levando em conta o salário mensal, os dias trabalhados e a quantidade de horas trabalhadas no dia atual. Caso o tempo de trabalho diário ultrapasse 8 horas, o programa também calcula o valor proporcional das horas extras.

## 📌 Funcionalidades

- Solicita ao usuário:
  - Salário mensal
  - Quantidade de dias trabalhados no mês
  - Horas trabalhadas no dia (no formato `hh:mm`)
- Calcula:
  - Valor do salário diário
  - Valor das horas extras, se houver
  - Valor total do dia (salário + extras)
- Exibe a data atual formatada (`dd/MM/yyyy`)

## 💻 Exemplo de uso

```bash
Qual seu salário? 3000
Quantos dias você trabalha? 22
Você trabalhou quantas horas hoje?(hh:mm) 09:30
```

Saída:

```
20/06/2025
Salário por dia: R$136.36
Extras: R$25.62
Salário com extras: R$161.98
```

## 🧠 Lógica das horas extras

- A jornada padrão é de **8 horas**.
- Se o tempo trabalhado no dia for maior que 8h, calcula-se o valor extra proporcional com base no valor da hora normal:
  
  ```
  valor hora normal = salário por dia / 8
  valor extra = (minutos extras / 60) * valor hora normal
  ```

## 🗂 Estrutura do projeto

```
/src
 ├── application/
 │    └── Program.java         # Classe principal que executa a lógica
 └── entities/
      └── WorkingDay.java      # Classe responsável pelos cálculos de salário e extras
```

## ✅ Requisitos

- Java 8 ou superior
- Um terminal para entrada/saída de dados
