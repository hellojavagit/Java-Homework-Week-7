package javaHomeworkWeek7;

import java.util.Scanner;
// program to find the average of array elements

public class AverageOfArrayElements {
    public static void main(String[] args) {

        int [] a = new int[10];
        int sum =0, average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Elements");
        for (int i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println( "Average of elements is " +(sum/10));

}}
