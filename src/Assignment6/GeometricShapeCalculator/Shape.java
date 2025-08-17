package Assignment6.GeometricShapeCalculator;

public abstract class Shape implements Measurable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public double getArea(){
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
