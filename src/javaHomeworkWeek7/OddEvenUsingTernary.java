package javaHomeworkWeek7;

import java.util.Scanner;

public class OddEvenUsingTernary {

    public static void main(String[] args) {
        System.out.println("Enter a Number");

        //scanner class to accept the input
        Scanner sc = new Scanner(System.in);
        //accepting an integer and assigning to number
        int  number = sc.nextInt();
        //using ternary operator
        ////variable = (condition)?TrueExpression:FalseExpression
       String  result = (number % 2==0) ? "even" :"Odd";
       System.out.println("number is " + result);

}
}
