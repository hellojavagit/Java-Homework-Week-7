package javaHomeworkWeek7;

import java.util.Scanner;
//program to calculate the commission and find total salary

public class SalesEmployeeCommission {
    int salesid; double salesamount, basicsalary,tbasicsalary;
    double comm;
    String sellername;

    //calling all methods into main by object

    public static void main(String[] args) {
        SalesEmployeeCommission sec = new SalesEmployeeCommission();
        sec.salesDetails();//instant methods called through object sec
        sec.commission();
        sec.display();
    }

    public void salesDetails() {
        //int salesid, salesamount, basicsalary;
        //double comm;
        //String sellername;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seller Name:");
        sellername = sc.nextLine();
        System.out.println("Enter sales id :");
        salesid = sc.nextInt();
        System.out.println("Enter  sales amount");
        salesamount = sc.nextInt();
        System.out.println(" Enter basic salary :");
        basicsalary = sc.nextInt();
    }
    public void commission() // calculating the commisiod total salary of seller
    {
        if (salesamount >= 50000)
        {
            tbasicsalary = basicsalary + (basicsalary * 0.35);
        } else if(salesamount >=30000) {
           tbasicsalary = basicsalary +(basicsalary * 0.2);
        }
        else if (salesamount>=20000)
           tbasicsalary = basicsalary+(basicsalary*0.1);
        else if(salesamount>=10000)
          tbasicsalary = basicsalary+(basicsalary*0.05);
        else if(salesamount<10000)
            tbasicsalary = basicsalary+(basicsalary*0.02);
    }
    public void display() //method to display the results
    {
        System.out.println(" Seller Name is : " + sellername );
        System.out.println(" Seller Id  is : " + salesid );
        System.out.println(" Sales Amount is : " + salesamount);
        System.out.println(" Salary Basic  is : " + basicsalary );
        System.out.println("Total salary including commission is : " + tbasicsalary);
    }
}

