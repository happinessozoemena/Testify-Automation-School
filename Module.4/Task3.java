public class Task3 {
    public static void main(String[] args) {
        // Creating a variable to store age
        int age = 29;

        // Method 1: Using the + operator for concatenation
        String message1 = "I am " + age + " years old.";
        System.out.println("Method 1: " + message1);

        // Method 2: Using String.format() method
        String message2 = String.format("I am %d years old.", age);
        System.out.println("Method 2: " + message2);
    }
}