package com.codewithazam.Day14;

public class AppleOrange {
    public static void main(String[] args) {
        int s = 7;
        int t = 10;

        int a = 4;
        int b = 12;

        int[] apples = {2, 3, -4};
        int[] oranges = {3, -2, -4};
        countApplesAndOranges(s, t, a, b, apples, oranges);

    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int x = 0;
        for (int i = 0; i < apples.length; i++) {
            int number = apples[i] + a;
            if (number >= s && number <= t)
                x++;
        }
        System.out.println(x);

        int o = 0;
        for (int j = 0; j < oranges.length; j++) {
            int number = oranges[j] + b;
            if (number >= s && number <= t)
                o++;
        }
        System.out.println(o);
    }
}
