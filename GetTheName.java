import java.util.Scanner;

// Write a Program to Get the Name using the Command Line

public class GetTheName {
    public static void main(String args[]){
        System.out.println("Enter Your Name");
        Scanner scanner = new Scanner((System.in));
        String name = scanner.nextLine();
        System.out.println("Your Name is: " + name);
    }

}
