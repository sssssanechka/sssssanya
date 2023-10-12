package lab5;

public class zd4 {
    public static void main(String args[]) {
        int[] array = {1, 5, 6, 8, 9, 10, 27, 15, 20, 25, 19, 14, 13, 30, 12, 11, 26, 28, 4, 3, 2, 17, 7, 21, 22, 29, 24, 23, 16, 18};

        int sum1 = 0; // сумма четных элементов
        int sum2 = 0; // сумма нечетных элементов

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum1 += array[i]; // четные элементы добавляем к сумме четных элементов
            } else {
                sum2 += array[i]; // нечетные элементы добавляем  к сумме нечетных элементов
            }
        }

        System.out.println("Сумма четных элементов: " + sum1);
        System.out.println("Сумма нечетных элементов: " + sum2);

    }
}
