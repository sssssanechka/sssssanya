package lab2;

import java.util.Scanner;

public class zd4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите высоту h (в метрах): ");
        double height = input.nextDouble();

        double g = 9.81; // ускорение свободного падения в м/с^2

        double time = Math.sqrt((2 * height) / g); // формула для расчета времени свободного падения

        System.out.println("Время свободного падения: " + time + " секунд");
    }
}
