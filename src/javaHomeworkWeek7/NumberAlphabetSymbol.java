package javaHomeworkWeek7;

import java.util.Scanner;

public class NumberAlphabetSymbol {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if ((ch >= '0')  && (ch <= '9'))
            System.out.println(" Entered character is Numeric");
        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.println("Entered input is Alphabet");
        } else
            System.out.println("Entered input is a Special Symbol");
    }
}
