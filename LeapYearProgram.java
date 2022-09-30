// Write a Leap Year Java Program that takes a Year as input and otputs the Year is Leap Year or not

import java.util.Scanner;
public class LeapYearProgram {
    public static void  main(String[] args){
        System.out.println("The Year should be above 1582");
        int year;
        System.out.println("Enter The Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            System.out.println("Year is a Leap Year" + year);
        }
        else {
            System.out.println("Year is not a leap Year" + year);

        }

    }

}
