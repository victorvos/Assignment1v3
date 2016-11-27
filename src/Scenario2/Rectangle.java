package Scenario2;

/**
 * Created by Victor on 22-11-2016.
 */
public class Rectangle implements Shape {

    @Override
    public void display(int x, int y, int w, int h){
        System.out.println("Rectangle drawn at " + x + ',' + y + " with width " + w + " and height " + h);
    }
}
