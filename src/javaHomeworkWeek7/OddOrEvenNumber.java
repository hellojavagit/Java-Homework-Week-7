package javaHomeworkWeek7;

import java.util.Scanner;
//program to check given number is even or odd

public class OddOrEvenNumber {
    public static void main(String[] args) {

        oddOrEven();// calling oddOrEven method into main method
    }
    public static void oddOrEven()
    {
        System.out.println("Enter a number to check  odd or even ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if ( number % 2 ==0)
        {
            System.out.println(number+ " is even number ");
        }
        else
        {
            System.out.println(number + " is odd number ");
        }

    }
}
