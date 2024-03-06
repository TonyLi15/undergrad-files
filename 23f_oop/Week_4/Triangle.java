package Week_4;

public class Triangle extends TwoDShape {
    private String style;

    //Default Constructor
    Triangle(){
        super();
        style = "none";
    }

    //Constructor
    Triangle(String s, double w, double h){
        super(w, h, "triangle");
        style = s;
    }

    //Triangle that has same weight and height
    Triangle(double x){
        super(x, "triangle");
        style = "filled";
    }


    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
