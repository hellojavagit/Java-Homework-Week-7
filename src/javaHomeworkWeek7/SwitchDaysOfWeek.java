package javaHomeworkWeek7;
//program to find days of week by using switch case including in methods
import java.util.Scanner;

public class SwitchDaysOfWeek {
    public static void main(String[] args) {
        SwitchDaysOfWeek sdw = new SwitchDaysOfWeek(); //calling instance method through an object
        sdw.weekDays();
    }

    public static void weekDays() {
        int day;
        System.out.println("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println(" Week Contains 1 to 7 Days ");
        }
    }
}