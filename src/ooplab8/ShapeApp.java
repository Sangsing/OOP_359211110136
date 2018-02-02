package ooplab8;

import java.util.concurrent.SynchronousQueue;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20,30);

        System.out.println(rectangle.findArea());
        Circle circle = new Circle(50);
        System.out.println(circle.findArea());
    }//main
}//class
