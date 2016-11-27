package Scenario2;

/**
 * Created by Victor on 22-11-2016.
 */
public class Main {
    public static void main(String[] args) {
        //adapter pattern
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        Adapter rect = new Adapter(rectangle);
        Adapter circ = new Adapter(circle);

        rectangle.display(1,2,5,6);
        circle.display(1,2,4,4);
        rect.display(1,2,5,6);
        circ.display(15,16,30,35);
    }
}
