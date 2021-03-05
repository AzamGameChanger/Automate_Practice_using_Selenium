package com.codewithazam.Day14;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(37);
        grades.add(38);

        List<Integer> output = gradingStudents(grades);
        for (Integer r : output) {
            System.out.println(r);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            if ((5 - (grades.get(i) % 5)) < 3 && grades.get(i) >= 37) {
                int output = grades.get(i) + (5 - (grades.get(i) % 5));
                result.add(output);
            }
            if (((5 - (grades.get(i) % 5)) >= 3) && grades.get(i) >= 37)
                result.add(grades.get(i));
            if (grades.get(i) < 37)
                result.add(grades.get(i));
        }
        return result;
    }
}
