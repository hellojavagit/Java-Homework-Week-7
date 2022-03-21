package javaHomeworkWeek7;

import java.util.Scanner;
//program to calculate student total , percentage and result through marks

public class StudentGradeResult {

    int rollno, engMarks,mathsMarks,scienceMarks;
    String sname,grade,result;
    float perc,total;

    public static void main(String[] args) {
        StudentGradeResult sgr = new StudentGradeResult();
        sgr.studentDetails();//calling details of student and marks
        sgr.calculations(); //method used to calculate the total,percentage  and result
        sgr.grades(); // method to check the grades
        sgr.display();// method to display the format
    }
    public void studentDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name :");
        sname = sc.nextLine();
        System.out.println("Enter roll no ");
        rollno = sc.nextInt();
        System.out.println("enter marks in 3 subjects");
        engMarks = sc.nextInt();
        scienceMarks = sc.nextInt();
        mathsMarks = sc.nextInt();
        if (engMarks>100 || scienceMarks>100 || mathsMarks>100)
        {
            System.out.println("Invalid input marks should be between 1 to 100");
        }
    }
    public void calculations()
    {
        total =  (engMarks+scienceMarks+mathsMarks);
        perc = (total *100)/300;
        if (perc>=35)
            result = "pass";
        else
            result= "fail";
    }
    public void grades()// method to calculate grades using if else
    {
        if (perc >=80)
            grade = "A+";
        else if (perc>=60)
            grade = "A";
        else if (perc >=50)
            grade = "B";
        else if (perc >=35 )
            grade= "C";
    }
    public void display() {
        System.out.println("-----------------------------------|");
        System.out.println("|         MARKS SHEET              |");
        System.out.println("|----------------------------------|");
        System.out.println("|   NAME           :     " + sname + "       |");
        System.out.println("|  Rollno          :     " + rollno + "      |");
        System.out.println("|------------------------------------|");
        System.out.println("|   Subjects    :      Marks          |");
        System.out.println("|--------------------------------------|");
        System.out.println("|   English     :      " + engMarks + "       |");
        System.out.println("|   Science     :      " + scienceMarks + "      |");
        System.out.println("|   Maths       :      " + engMarks + "     |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|   Total        :       " + total + "     |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|    Percentage  :  " + perc + "       " + "|");
        System.out.println("|    Result      :   " + result + "               " + "|");
        System.out.println("|    Grade       :    " + grade + "               " + "|");
        System.out.println("|--------------------------------------------|");
    }

    }


