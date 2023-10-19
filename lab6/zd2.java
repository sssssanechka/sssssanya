package lab6;

import java.util.Scanner;

public class zd2 {
    public static void main(String[] args) {
// Вводим данные от пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип кредита (1 - ипотечный, 2 - автомобильный, 3 - образовательный): ");
        int creditType = scanner.nextInt();

        System.out.print("Введите сумму кредита: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Введите ежегодную процентную ставку: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Введите срок кредита в годах: ");
        int loanTermInYears = scanner.nextInt();

// Вычисляем ежемесячную процентную ставку и срок кредита в месяцах
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int loanTermInMonths = loanTermInYears * 12;

// Вычисляем ежемесячный платеж и стоимость кредита
        double monthlyPayment = calculateMonthlyPayment(creditType, loanAmount, monthlyInterestRate, loanTermInMonths);
        double totalCost = calculateTotalCost(monthlyPayment, loanTermInMonths);

// Выводим результаты
        System.out.println("Ежемесячный платеж: " + monthlyPayment);
        System.out.println("Стоимость кредита: " + totalCost);
    }

    public static double calculateMonthlyPayment(int creditType, double loanAmount, double monthlyInterestRate, int loanTermInMonths) {
        double monthlyPayment;
        if (creditType == 1) { // Ипотечный кредит
            monthlyPayment = loanAmount * monthlyInterestRate /
                    (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths));
        } else if (creditType == 2) { // Автомобильный кредит
            monthlyPayment = (loanAmount + loanAmount * monthlyInterestRate * loanTermInMonths) /
                    loanTermInMonths;
        } else if (creditType == 3) { // Образовательный кредит
            monthlyPayment = loanAmount / loanTermInMonths;
        } else {
            throw new IllegalArgumentException("Неправильный тип кредита");
        }
        return monthlyPayment;
    }

    public static double calculateTotalCost(double monthlyPayment, int loanTermInMonths) {
        return monthlyPayment * loanTermInMonths;
    }
}
