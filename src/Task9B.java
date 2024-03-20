import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter 'testify': ");
            String input = scanner.nextLine();

            if (input.equals("testify")) {
                System.out.println("Congratulations! You entered 'testify'.");
                break;
            } else {
                System.out.println("Incorrect input. Please try again.");
            }
        }

        scanner.close();
    }
}
