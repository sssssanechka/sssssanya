package lab5;

import java.util.Arrays;

public class zd6 {
    public static void main(String args[]) {
        int[] array = {1,5,6,8,9,10,15,20,25,19,14,13,12,11,4,3,2,17,7,21,22,24,23,16,18};
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Массив:");

        int minIndex = 0;
        int maxIndex = 0;
        int minValue = array[minIndex];
        int maxValue = array[maxIndex];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        int newArray = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = newArray;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
