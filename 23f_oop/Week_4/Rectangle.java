package Week_4;

public class Rectangle extends TwoDShape{
    // Default Constructor
    Rectangle(){
        super();
    }

    // Regular Constructor for Rectangle
    Rectangle(double w, double h){
        super(w, h, "rectangle");
    }

    // Construct a square
    Rectangle(double x){
        super(x, "square");
    }

    // Construct a rectangle from a rectangle
    Rectangle(Rectangle obj){
        super(obj);
    }

    boolean isSquare(){
        return getName() == "square";
    }

    double area(){
        return getWidth() * getHeight();
    }

}
