package javaHomeworkWeek7;

import java.util.Scanner;
//program to find specific value in an array

public class ArraySpecificValue {
    public static void main(String[] args) {
        int[] array = new int[10];//an integer array of size 10 elements
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i = 0; i < 10; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(" Enter a specific value ");
        int svalue = sc.nextInt();
        for (int j = 0; j < 10; j++)
            if (svalue == array[j]) {
                found = true;
                break;
            }
        if (found) {
            System.out.println("Specific value " + svalue + " matches with array elements");
        }
    else{
            System.out.println("Specific value " + svalue + " is not in the list");
        }
    }
}