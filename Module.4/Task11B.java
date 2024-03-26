public class B {
    public static void main(String[] args) {
        A a = new A();
        String name = a.getName("happiness");
        System.out.println("Name from method in class A: " + name);
    }
}