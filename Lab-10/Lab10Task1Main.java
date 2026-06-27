abstract class Lab10Task1Shape {

    abstract void area();
}
class Lab10Task1Circle extends Lab10Task1Shape {

    double radius = 7;

    @Override
    void area() {
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Lab10Task1Rectangle extends Lab10Task1Shape {

    double length = 10;
    double width = 5;

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Lab10Task1Main {

    public static void main(String[] args) {

        Lab10Task1Circle circle = new Lab10Task1Circle();
        Lab10Task1Rectangle rectangle = new Lab10Task1Rectangle();

        circle.area();
        rectangle.area();
    }
}