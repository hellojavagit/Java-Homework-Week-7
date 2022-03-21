package javaHomeworkWeek7;

import java.util.Scanner;
//program to accept a symbol and perform operation on 2 numbers

public class CalculatorUsingIf {
    public static void main(String[] args) {
        Calculator();
    }

    public static void Calculator() {
        int a, b;
        String symbol;
        System.out.println("Enter two numbers ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b = sc.nextInt();

        System.out.println(" Enter symbol for operation to perform ");
        symbol = sc.nextLine();

        if (symbol == "+")
        {
            System.out.println(" Addiiton of two numbers " + a + "," + b + "is:" + (a + b));
        } else if (symbol == "-") {
            System.out.println(" Subtraction of two numbers " + a + "," + b + "is:" + (a - b));
        } else if (symbol =="*" ) {
            System.out.println(" Multiplication  of two numbers " + a + "," + b + "is:" + (a + b));
        } else if (symbol == "/") {
            System.out.println(" Division of two numbers " + a + "," + b + "is:" + (a + b));
        }
    }
}