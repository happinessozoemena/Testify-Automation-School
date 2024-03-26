public class B {

        public static void main(String[] args) {
            // Creating objects of class A using different constructors
            A obj1 = new A();
            A obj2 = new A(20); 
            A obj3 = new A(40, 60);

            // Printing values of objects
            System.out.println("Value of obj1: " + obj1.getValue());
            System.out.println("Value of obj2: " + obj2.getValue());
            System.out.println("Value of obj3: " + obj3.getValue());
        }
    }