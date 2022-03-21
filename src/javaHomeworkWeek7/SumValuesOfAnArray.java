package javaHomeworkWeek7;

import java.util.Scanner;
//program to calculate the sum of array elements in 2 methods

public class SumValuesOfAnArray {
    public static void main(String[] args) {
        //int[] a = {10, 20, 30, 40, 50,60};
        //int sum=0;
        //for (int i = 0; i < a.length; i++){
         //   sum =sum +  a[i];}
        //System.out.println("Sum of values of array is : " + sum);
        //program of sum of array using user enter values
        int [] array = new int[10];//defining an array of size 10;
        int sum =0;
        Scanner ae = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i= 0;i<10;i++)
        {
            array[i]  = ae.nextInt();//accepting array elements through scanner
            sum = sum + array[i];
        }
        System.out.println("Sum of array elements is :" + sum);

    }
}