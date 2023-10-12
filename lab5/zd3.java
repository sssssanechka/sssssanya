package lab5;

public class zd3 {
    public static void main(String args[]){
        int[] array = {1,5,6,8,9,10,15,20,19,14,13,12,11,4,3,2,17,7,16,18};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Среднее значение: " + average);
    }
}
