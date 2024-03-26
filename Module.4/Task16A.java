public class A {

    
    public void printMessage() {
        System.out.println("No parameter method");

    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);

    }

    // Method 2: Overloading by changing the data type of parameters
    public void printNumber(int number) {
        System.out.println("Integer number: " + number);

    }

    public void printNumber(double number) {
        System.out.println("Double number: " + number);
    }

    // Method 3: Overloading by changing the sequence of parameters
    public void printValues(int value1, double value2) {
        System.out.println("Integer value: " + value1 + ", Double value: " + value2);
    }

    public void printValues(double value2, int value1) {
        System.out.println("Double value: " + value2 + ", Integer value: " + value1);

    }

    public static void main(String[] args) {
        A obj = new A();

        obj.printMessage(); 
        obj.printMessage("Hello, World!"); 

        // Method 2: Overloading by changing the data type of parameters
        obj.printNumber(20); 
        obj.printNumber(5.12); 

        obj.printValues(3, 1.2); 
        obj.printValues(1.2, 3);

    }
}