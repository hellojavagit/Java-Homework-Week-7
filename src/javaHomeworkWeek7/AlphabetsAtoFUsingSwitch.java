package javaHomeworkWeek7;

import java.util.Scanner;
// program to get city names from A to F using switchcase statements.

public class AlphabetsAtoFUsingSwitch {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a Character");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);// to accept a character from user
        switch (ch) {
            case 'A':
                System.out.println(" ABERDEEN ");
                break;

            case 'B':
                System.out.println(" BIRMINGHAM ");
                break;
            case 'C':
                System.out.println(" COVENTRY ");
                break;
            case 'D':
                System.out.println(" DERBY ");
                break;
            case 'E':
                System.out.println(" EDINBURGH ");
                break;
            case 'F':
                System.out.println(" FARNBOROUGH ");
                break;
            default:
                System.out.println(" ENTER ALPHABETS FROM A TO F ONLY ");
        }
    }
}