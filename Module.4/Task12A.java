

public class A {
    public static void main(String[] args) {
        A a = new A();
         a.publiclyAccessibleMethod();

    }
    public void publiclyAccessibleMethod() {
        System.out.println("This method is Accessible anywhere in the project");
    }
}