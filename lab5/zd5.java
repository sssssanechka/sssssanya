package lab5;

import java.util.Random;

public class zd5 {
    public static void main(String args[]) {
        int[][] array = new int[3][5];
        Random random = new Random();

// заполнение таблицы случайными элементами от 0 до 9

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10); // генерация случайного числа от 0 до 9
            }
        }

// вывод таблицы

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
