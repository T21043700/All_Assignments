package Assignment6.GeometricShapeCalculator;

public class Circle extends Shape {

    //variable for circle radius
    private final double radius;

    //Constructor for the class Circle
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    //Override the method toString() to use it in detailsPrintOut() method
    public String toString() {
        return "Radius: " + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
