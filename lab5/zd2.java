package lab5;


import java.lang.reflect.Array;
import java.util.Arrays;

public class zd2 {
    public static void main(String args[]){
        int[] array = {1,5,6,8,9,10,15,20,25,19,14,13,12,11,4,3,2,17,7,21,22,24,23,16,18};


        Arrays.sort(array);


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


