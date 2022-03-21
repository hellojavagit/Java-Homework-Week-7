package javaHomeworkWeek7;

import java.util.Scanner;

public class NumericAlphabetSymbolMethod
{
    public static void main(String[] args)
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        ch = sc.next().charAt(0);
        //using character class to check if input is numeric, alphabet or symbol
        if (Character.isAlphabetic(ch))//using isalphabetic() method
        {
            System.out.println(" Entered character " + ch +" is Alphabet ");
        }else if (Character.isDigit(ch)) {
            System.out.println(" Entered Character " + ch + " is Numeric ");
        }
        else
            System.out.println(" Entered Character " + ch + " is a Special Symbol ");
    }
}
