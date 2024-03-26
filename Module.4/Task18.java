import java.util.InputMismatchException;
import java.util.Scanner;


public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Print the age entered by the user
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid age as an integer.");
        }

    }
}