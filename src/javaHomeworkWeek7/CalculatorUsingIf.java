package javaHomeworkWeek7;

import java.util.Scanner;
//program to accept a symbol and perform operation on 2 numbers

public class CalculatorUsingIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1,num2,result;
        char ch;
        System.out.println("Enter two Numbers ");
        num1 = sc.nextFloat();// accepts float number as input
        num2 = sc.nextFloat();
        System.out.println("Enter the operator");
        ch = sc.next().charAt(0);//accepts a character as input
        if (ch == '+')
        {
            result = num1 + num2 ;
            System.out.println("Addition of 2 numbers is :" + result);
        }else if (ch == '-')
        {
            result = num1-num2 ;
            System.out.println("Subtraction of 2 numbers is :" + result);
        }else if(ch == '*')
        {
           result = num1 * num2 ; 
            system.out.println("Multiplication of 2 numbers is :" + result);
        } else if (ch == '/')
        {
            result = num1/num2 ;
            system.out.println("Division of 2 numbers is :" + result);
        }
        else
        {
            system.out.println(("Enter correct operator");
            return;
                               
           }
     }
  }
            
            
        
       
        
        
    


   
