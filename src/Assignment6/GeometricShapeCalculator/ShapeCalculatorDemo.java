package Assignment6.GeometricShapeCalculator;

public class ShapeCalculatorDemo {
    public static void main(String[] args) {

        //Start new Array
        Shape[] sh1 = new Shape[3];

        //Declare instances of the Array using Polymorphism
        sh1[0] = new Circle(5);
        sh1[1] = new Rectangle(6, 4);
        sh1[2] = new Circle(2.5);

        //Print Main Calculations
        mainPrintOut(sh1);

        //Print Details of the initialized instances
        detailsPrintOut(sh1);

    }

    //This method is used to Print Main Calculations
    public static void mainPrintOut(Shape[] shapes) {
        System.out.println("--- Geometric Shape Calculator Demo ---\n");
        System.out.println("--- Calculating Area and Perimeter for various shapes ---\n");
        for (Shape sh : shapes) {
            System.out.printf("Shape: %s\n  Area: %.2f\n  Perimeter: %.2f\n\n", sh.name, sh.getArea(), sh.getPerimeter());
        }
    }

    //This method is used to Print Details of the initialized instances
    public static void detailsPrintOut(Shape[] shapes) {
        System.out.println("--- Specific Shape Details ---\n");

        //Increased these variables as the number of instances instantiated from each one of them
        int circleInstanceNumber = 1;
        int rectangleInstanceNumber = 1;

        //Loop through instances to determine which detail to print
        for (Shape sh : shapes) {
            switch (sh.getClass().getSimpleName()) {
                case "Circle":
                    System.out.printf("%s: %d, %s\n", sh.getClass().getSimpleName(), circleInstanceNumber, sh.toString());
                    circleInstanceNumber++;
                    break;
                case "Rectangle":
                    System.out.printf("%s: %d, %s\n", sh.getClass().getSimpleName(), rectangleInstanceNumber, sh.toString());
                    rectangleInstanceNumber++;
                    break;
            }
        }
        System.out.println("\n--- End of Demo ---");
    }
}
