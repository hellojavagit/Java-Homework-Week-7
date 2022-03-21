package javaHomeworkWeek7;

public class DivisibleBy3AND5 {
    public static void main(String[] args)
    {
        int i, j;
        System.out.println(" Numbers Divisible by 3 From 1 to 100 are:  ");
        for (i=1; i<=100; i++) // for loop to check 100 numbers
        {
            if (i % 3 == 0)
                System.out.print(i+ "  ");
        }
        System.out.println();
        System.out.println("Numbers Divisible by 5 From 1 to 100 are:  ");
        for (j = 1; j<=100;j++)//using for loop statements
        {
            if (j % 5 == 0)
                System.out.print(j + "  ");
        }
    }
}
