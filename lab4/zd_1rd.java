package lab4;

import java.util.Random;

public class zd_1rd {
    public static void main(String[] args) {
        Random random = new Random(); //Генерация рандомного числа
        int z = random.nextInt(10); //Получение рандомного числа от 0 до 9

        switch (z) { //Оператор с условиями
            case 0 -> System.out.println("Ноль");
            case 1 -> System.out.println("Один");
            case 2 -> System.out.println("Два");
            case 3 -> System.out.println("Три");
            case 4 -> System.out.println("Четыре");
            case 5 -> System.out.println("Пять");
            case 6 -> System.out.println("Шесть");
            case 7 -> System.out.println("Семь");
            case 8 -> System.out.println("Восемь");
            case 9 -> System.out.println("Девять");
            default -> System.out.println("Ошибка. Введите число от 1 до 9");
        }
    }
}
