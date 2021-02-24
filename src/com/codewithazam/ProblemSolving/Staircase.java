package com.codewithazam.ProblemSolving;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
//Here my problem was not knowing nested loops very well = i have to research and understand em well
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number; j++) {
                if  (j<number-i)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }

    }
}
//  #
// ##
//###