import Task15.ChildClassB;

public class ChildClass extends ParentClass {

    // Overriding method 1
    public void method1(int number) {
        System.out.println("Child class - Overridden Method 1: " + number);
    }

    // Overriding method 2
    public void method2(String message) {
        System.out.println("Child class - Overridden Method 2: " + message);
    }


    public static void main(String[] args) {
        // Create an object of child class
        ChildClass child = new ChildClass();

        // Call the overridden methods
        child.method1(20);
        child.method2("Hello World");
    }
}