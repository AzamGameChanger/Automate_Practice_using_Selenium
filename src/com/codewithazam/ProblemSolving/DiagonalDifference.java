package com.codewithazam.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 3},
                {1, 2, 0},
                {1, 0, 1},
        };

        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : arr) {
            List<Integer> list = new ArrayList<>();
            for (int i : ints) {
                list.add(i);
            }
            lists.add(list);
        }
        System.out.println(lists);

        int result = diagonalDifference(lists);
        System.out.println(result);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.size(); i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get((arr.size()-1)- i);
        }
        int result = left - right;
        return Math.abs(result);
    }
}
