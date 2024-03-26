public class A {
        public static void main(String[] args) {
    }
        private int value;


        // Constructor 1: Default constructor
        public A() {
            this.value = 0;
        }

        // Constructor 2: Constructor with one parameter
        public A(int value) {
            this.value = value;
        }

        // Constructor 3: Constructor with two parameters
        public A(int value1, int value2) {
            this.value = value1 + value2;
        }

        // Getter method for value
        public int getValue() {
            return value;
        }
    }