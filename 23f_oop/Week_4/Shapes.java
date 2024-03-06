package Week_4;

public class Shapes {
    public static void main(String[] args){
        TwoDShape[] shapes = new TwoDShape[4];

        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);

        for(int i=0; i < shapes.length; i++) {

            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            if(shapes[i] instanceof Rectangle){
                Rectangle r = (Rectangle) shapes[i];
                if (r.isSquare()) System.out.println("This is square");
            }else if(shapes[i] instanceof Triangle){
                Triangle t = (Triangle)shapes[i];
                t.showStyle();
            }

            System.out.println();
        }

    }

}
