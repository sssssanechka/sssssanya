package lab5;

import java.util.Arrays;

public class zd7 {
    public static void main(String[] args) {
        int[] s1 = {1, 2, 3};
        int[] s2 = {4, 5, 6};
        int[] s3 = {7, 8, 9};
        int[] s4 = {7, 8, 9};
        int[] s5 = {7, 8, 9};

        int[] result;
        if (Arrays.equals(s4, s5)) {
            result = new int[s1.length + s2.length];
            System.arraycopy(s1, 0, result, 0, s1.length);
            System.arraycopy(s2, 0, result, s1.length, s2.length);
        } else {
            result = new int[s1.length + s3.length];
            System.arraycopy(s1,0, result, 0, s1.length);
            System.arraycopy(s3, 0, result, s1.length, s3.length);
        }

        System.out.println("Результат: " + Arrays.toString(result));
    }
}
