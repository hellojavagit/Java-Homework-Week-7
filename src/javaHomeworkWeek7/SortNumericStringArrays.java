package javaHomeworkWeek7;

import java.util.Arrays;
import java.util.Scanner;
//program to sort an numeric array and string array

public class SortNumericStringArrays {

        int[] a = new int[10];
        String[] b = new String[10];

    public static void main(String[] args)
    {
        SortNumericStringArrays scarray = new SortNumericStringArrays();
        scarray.numericarray();
        scarray.stringsarray();
    }

    public void numericarray()
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers to sort ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Ascending Order");
        System.out.println(Arrays.toString(a));
      }
      public void stringsarray()// to sort string array
      { String [] b = new String[10];
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter strings to sort");
          for (int i=0;i<10;i++) {
              b[i] = sc.nextLine();// accepts string of length 10
          }
          Arrays.sort(b);
          System.out.println("alphabetical order");
          System.out.println(Arrays.toString(b));//method to sort string array
          }
      }


