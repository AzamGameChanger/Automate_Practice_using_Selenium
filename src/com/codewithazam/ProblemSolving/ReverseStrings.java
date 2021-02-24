package com.codewithazam.ProblemSolving;

public class ReverseStrings {
    public static void main(String[] args) {
        String[] names = {"Ana", "Iti", "Amin", "Lol", "Kal", "Non"};
        int x = 0;
        for (int i = 0; i < names.length; i++) {

            String reverse = new StringBuffer(names[i]).reverse().toString();
            if (reverse.equalsIgnoreCase(names[i]))
                x++;
        }
        System.out.println(x);
    }
}
