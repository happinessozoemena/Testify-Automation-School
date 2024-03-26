public class B {
    // Class B
        public static void main(String[] args) {
            A square = new A();


            // Set the values of length and breadth
            square.setShapeLength(4.0);
            square.setShapeBreadth(4.0);

            // Calculate the area
            double area = square.getShapeLength() * square.getShapeBreadth();

            
            System.out.println("The area of a square of length: " + square.getShapeLength() +
                    " and breadth " + square.getShapeBreadth() + " is " + area);
        }
    }