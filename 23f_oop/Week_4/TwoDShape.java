package Week_4;

abstract class TwoDShape {
    private double width;
    private double height;

    private String name;

    // Default Constructor
    TwoDShape(){
        width = height = 0.0;
        name = "none";
    }
    // Parameterized Constructor
    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    // TwoDShape that has same width and height
    TwoDShape(double x, String n){
        width = height = x;
        name = n;
    }

    // Construct a TwoDShape from a TwoDShape
    TwoDShape(TwoDShape obj){
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

    // Accessor Methods for width and height
    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    String getName(){
        return name;
    }

    void setWidth(double w){
        width = w;
    }

    void setHeight(double h){
        height = h;
    }


    void showDim(){
        System.out.println("width and height are: " + width + " and " + height);
    }

    abstract double area();

}
