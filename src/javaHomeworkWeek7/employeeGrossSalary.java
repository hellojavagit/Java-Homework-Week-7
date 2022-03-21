package javaHomeworkWeek7;

import java.util.Scanner;

public class employeeGrossSalary {
    public static void main(String[] args) {
        employeeGrossSalary emp = new employeeGrossSalary();
        emp.grossSalary();
    }
      public  void grossSalary()
        {
            int BasicSalary, Empid;
            double HRA, DA, TA, PF, Grosssal;
            String Empname;

            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter name of employee");
            Empname = sc.nextLine();
            System.out.println("Enter employee id ");
            Empid = sc.nextInt();
            System.out.println("Enter basic salary ");
            BasicSalary = sc.nextInt();

           HRA = (BasicSalary * 0.1);
            DA = (BasicSalary * 0.08);
            TA = (BasicSalary * 0.09);
            PF = (BasicSalary* 0.2);
            Grosssal = (BasicSalary + HRA + TA + DA -PF);
            System.out.println(PF);


            System.out.println("-----------------------------------");
            System.out.println("|        Salary Slip              |");
            System.out.println("|---------------------------------|");
            System.out.println( "| Employee Id  :"  + Empid +      "|");
            System.out.println("| Employee Name :" + Empname +   "|");
            System.out.println("----------------------------------|");
            System.out.println("| Basic Salary  :" + BasicSalary + " |");
            System.out.println("|  HRA  10%     :" + HRA +        "|");
            System.out.println("|  TA    8%     :" + TA +         "|");
            System.out.println("|  DA    9%     :" + DA +         "|");
            System.out.println("|  PF   -20 %   :" + PF +         "|");
            System.out.println("                                    ");
            System.out.println("|-----------------------------------|");
            System.out.println("|Gross Salary   :"   +Grosssal +   "|");
            System.out.println("|-----------------------------------|");
        }
    }
