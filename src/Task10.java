public class Task10 {

    public static void verifyVisitors(String message) {
        if (message.contains("Testify")) {
            System.out.println("Welcome! Thank you for joining Testify Trainings.");
        } else {
            System.out.println("Sorry, you are not authorized to join Testify Trainings.");
        }
    }

    public static void main(String[] args) {
        // Example invocation of the method
        String visitorMessage = "I'm interested in Testify Trainings";
        verifyVisitors(visitorMessage);
    }
}
