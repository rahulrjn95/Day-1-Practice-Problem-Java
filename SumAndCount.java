import java.util.Scanner;

// Write a Program To Find the Sum of Command-line arguments and count the invalid integers entered.

public class SumAndCount {
    public static void main(String args[]){
        System.out.println("Enter First Number");
        Scanner obj1 = new Scanner(System.in);
        int number1 = obj1.nextInt();
        System.out.println("Enter Second Number");
        Scanner obj2 = new Scanner(System.in);
        int number2 = obj2.nextInt();
        int sum = number1+number2;
        System.out.println("Your Sum is:" +sum);

    }
}
