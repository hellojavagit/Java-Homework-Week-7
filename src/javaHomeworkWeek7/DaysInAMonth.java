package javaHomeworkWeek7;

import java.util.Scanner;
//program to calculate if a year is leapyear or not and also number of days in a month
//NOTE : WHY ITS ASKING FOR TWICE ENTER OF THE YEAR AND MONTH IN getDaysInMonth method()

public class DaysInAMonth {
    static boolean b;

    public static void main(String[] args)
    {

        isLeapYear(2000);
        System.out.println(b);
        getDaysinMonth(8, 2000);
        System.out.println("Number of days " + DaysInAMonth.getDaysinMonth(8, 2000));
    }
// method to check if the given year is leap year or not
    public static boolean isLeapYear(int year)
    {
        System.out.println("1.Enter a year ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ((year < 1) || (year > 9999))
        {
            b = false;
        } else if (((year % 4) == 0) || (((year % 400 == 0))) && ((year % 100) != 0)) {
            b = true;
        }
        return b;
    }
// method to calculate the days in a month
    public static int getDaysinMonth(int month, int year) {
        String monthname ;
        int daysinmonth=0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("2.Enter a year");
        year = sc1.nextInt();
        System.out.println("Enter a month ");
        month = sc1.nextInt();

        if ( (year < 1) || (year > 9999))
        System.out.println("-1 invalid year");
        else {
            switch (month) {// using switch case statement to calculate the days in month
                case 1:
                    monthname = "january";
                    daysinmonth = 31;
                    break;
                case 2:
                    //monthname = "february";
                    if ( b == true ){
                   
                        daysinmonth = 29;
                    }
                    else
                    {
                        daysinmonth = 28;
                    }
                    break;
                case 3:
                    monthname = "march";
                    daysinmonth = 31;
                    break;
                case 4:
                    monthname = "april";
                    daysinmonth = 30;
                    break;
                case 5:
                    monthname = "may";
                    daysinmonth = 31;
                    break;
                case 6:
                    monthname = "june";
                    daysinmonth = 30;
                case 7:
                    monthname = "july";
                    daysinmonth = 31;
                    break;
                case 8:
                    monthname = "August";
                    daysinmonth = 31;
                    break;
                case 9:
                    monthname = "september";
                    daysinmonth = 30;
                    break;
                case 10:
                    monthname = "october";
                    daysinmonth = 31;
                    break;
                case 11:
                    monthname = "november";
                    daysinmonth = 30;
                    break;
                case 12:
                    monthname = "december";
                    daysinmonth = 31;
                    break;
                default:
                    System.out.println("-1 invalid month");
            }
        }
        return daysinmonth;


    }
}


