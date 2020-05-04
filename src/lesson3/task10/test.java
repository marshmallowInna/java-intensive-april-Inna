package lesson3.task10;


import sun.security.util.BitArray;

import java.util.Random;

public class test {
    double volume;
    int CPU;
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 2, 7};
        sum(arr);
    }

    public static void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println(sum);
        }

    }
}




