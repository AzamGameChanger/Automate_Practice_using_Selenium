package com.codewithazam.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        alice.add(5);
        alice.add(2);
        alice.add(5);
        List<Integer> bob = new ArrayList<>();
        bob.add(1);
        bob.add(2);
        bob.add(3);

        List<Integer> result = compareTriplets(alice, bob);
        System.out.println(Arrays.toString(result.toArray()));

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        Integer[] p = new Integer[2];
        p[0] = 0;
        p[1] = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                p[0] = p[0] + 1;
                continue;
            }
            if (a.get(i) < b.get(i)) {
                p[1] = p[1] + 1;
                continue;
            }
        }
        return Arrays.asList(p);
    }
}



