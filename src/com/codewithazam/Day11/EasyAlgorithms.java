package com.codewithazam.Day11;

import java.util.HashSet;

public class EasyAlgorithms {
    public static void main(String[] args) {
        String names= "aaabbbddd";
        HashSet<Character> sets = new HashSet<>();
        for (char i : names.toCharArray()) {
            sets.add(i);
        }

        String newString = "";
        for (char i : sets) {
            newString += i;
        }
        System.out.println(newString);
    }

}
