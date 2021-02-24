package com.codewithazam.ProblemSolving;

public class MiniMaxSum {
    public static void main(String[] args) {
        //we have an array, we have to find min and max summing array.length-1; array's size should be 5 in this exercise
        //print like [ min max ]

        int[] arr = {942381765, 627450398, 954173620, 583762094, 236817490};
        miniMaxSum(arr);

    }
    public static void miniMaxSum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];

        }
        System.out.println((sum - max) + " " + (sum - min));

    }
}
