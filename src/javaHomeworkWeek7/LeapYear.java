package javaHomeworkWeek7;

import java.util.Scanner;

    public class LeapYear {
        public static void main(String[] args)
        {
            leapyear();
        }
        public static void leapyear ()
        {
            System.out.println("Enter a year to check ");
            Scanner sc = new Scanner(System.in);// defining scanner class
            int year = sc.nextInt(); // accepting input through scanner class
            if (year % 4 == 0)
                System.out.println(+year + " is a LeapYear");
            else
                System.out.println(+year + " is not a LeapYear");
        }
    }

