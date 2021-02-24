package com.codewithazam.ProblemSolving;

public class PlusMinus {
    public static void main(String[] args) {
        int[] array = {1, 1, -1, -1, 0};
        plusMinus(array);
    }

    public  static void plusMinus(int[] arr) {
        int p = 0;
        int n = 0;
        int z = 0;
        int sizeArr = arr.length;
        for (int i = 0; i < sizeArr; i++) {
            if (arr[i] > 0)
                p++;
            else if (arr[i] < 0)
                n++;
            else
                z++;
        }
        System.out.println(String.format("%6f", (double) p / (double) sizeArr));
        System.out.println(String.format("%6f", (double) n / (double) sizeArr));
        System.out.println(String.format("%6f", (double) z / (double) sizeArr));
    }
}
