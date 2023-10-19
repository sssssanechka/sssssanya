package lab6;

import java.util.Scanner;

public class zd1 {
    public static void main(String args[]) {
        int numberOf5000, numberOf2000, numberOf1000,numberOf500, numberOf200, numberOf100, numberOf50, numberOf10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму: ");

        int amount = sc.nextInt();

        numberOf5000 = amount / 5000;
        amount %= 5000;

        numberOf2000 = amount / 2000;
        amount %= 2000;

        numberOf1000 = amount / 1000;
        amount %= 1000;

        numberOf500 = amount / 500;
        amount %= 500;

        numberOf200 = amount / 200;
        amount %= 200;

        numberOf100 = amount / 100;
        amount %= 100;

        numberOf50 = amount / 50;
        amount %= 50;

        numberOf10 = amount / 10;
        amount %= 10;

        System.out.println("Количество 5000 купюр: " + numberOf5000);
        System.out.println("Количество 2000 купюр: " + numberOf2000);
        System.out.println("Количество 1000 купюр: " + numberOf1000);
        System.out.println("Количество 500 купюр: " + numberOf500);
        System.out.println("Количество 200 купюр: " + numberOf200);
        System.out.println("Количество 100 купюр: " + numberOf100);
        System.out.println("Количество 50 купюр: " + numberOf50);
        System.out.println("Количество 10 купюр: " + numberOf10);
        System.out.println("Остаток: " + amount);

    }
}
