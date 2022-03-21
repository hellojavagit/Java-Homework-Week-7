package javaHomeworkWeek7;

import java.util.Scanner;
//program to check if entered number is positive,negative or zero

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int number;

        System.out.println(" Enter a number ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number > 0) {
            System.out.println("Entered  number is POSITIVE");
        } else if (number == 0) {
            System.out.println("Entered number is ZERO");
        } else
            System.out.println(" Entered number is NEGATIVE");
    }
}
