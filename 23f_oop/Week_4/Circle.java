package Week_4;

public class Circle extends TwoDShape {
    // Default Constructor
    Circle(){
        super();
    }

    // Regular Circle Constructor: double x stands for the radius
    Circle(double x){
        super(x, "circle");
    }

    // Construct a circle from another circle
    Circle(Circle obj){
        super(obj);
    }

    // Computes the area of the circle
    double area(){
        return Math.pow(getWidth() / 2, 2) * Math.PI;
    }

    // Demonstrates the circle class
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(c2);

        System.out.println("Info for c1: ");
        c1.showDim();
        System.out.println("Area is " + c1.area());

        System.out.println();

        System.out.println("Info for c2: ");
        c2.showDim();
        System.out.println("Area is " + c2.area());

        System.out.println();

        System.out.println("Info for c3: ");
        c3.showDim();
        System.out.println("Area is " + c3.area());
    }


}
