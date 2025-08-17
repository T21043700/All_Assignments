package Assignment6.GeometricShapeCalculator;

public class Rectangle extends Shape {

    //variable for rectangle length
    private final double length;

    //variable for rectangle width
    private final double width;

    //Constructor for the class Rectangle
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    //Override the method toString() to use it in detailsPrintOut() method
    public String toString() {
        return "Length: " + length +", Width: " + width;
    }


    @Override
    public double getArea() {
        return (length * width);
    }

    @Override
    public double getPerimeter() {
        return (2 * (length + width));
    }
}
