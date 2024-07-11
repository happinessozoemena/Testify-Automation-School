public class A {
    
    // Private variables
    private int shapeSides;
    private double shapeLength;
    private double shapeBreadth;

    // Constructor
    public A() {
        this.shapeSides = 4; 
    }

    
    public int getShapeSides() {
        return shapeSides;
    }

    
    public double getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(double length) {
        this.shapeLength = length;
    }

    // Getter and setter for shapeBreadth
    public double getShapeBreadth() {
        return shapeBreadth;
    }

    public void setShapeBreadth(double breadth) {
        this.shapeBreadth = breadth;
    
    }
}
