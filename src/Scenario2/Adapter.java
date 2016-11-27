package Scenario2;

/**
 * Created by Victor on 22-11-2016.
 */
public class Adapter implements Shape{
    Shape shape;

    public Adapter(Shape newShape){
        shape = newShape;
    }

    public void display(int x1, int y1, int x2, int y2){
//        int w = x2 - x1;
//        int h = y2 - y1;
//        int x = x1;
//        int y = y1;
        String soortShape = String.valueOf(shape.getClass());
        soortShape = soortShape.split("\\.")[1];
        System.out.println(soortShape + " drawn at (" + x1 + ',' + y1 + ") bottomleft and (" + x2 + ',' + y2 + ") top right ");
    }
}
