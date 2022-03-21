package javaHomeworkWeek7;

import java.util.Scanner;
// program to print city names  from  A to F using if-else

public class AlphabetsAToF {
    public static void main(String[] args) {
        char ch;

        System.out.println(" Enter a character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);// method to enter a character through keyboard
        if (ch == 'A')
            System.out.println(" Aberdeen");
        else if (ch == 'B')
            System.out.println("Birmingham");
        else if (ch == 'c')
            System.out.println("Coventry");
        else if (ch == 'D')
            System.out.println("Dorset");
        else if (ch == 'E')
            System.out.println("Edinburgh");
        else if (ch == 'F')
            System.out.println("Farnborough");
        else
            System.out.println(" please enter valid alphabet from A to F ");
    }
}