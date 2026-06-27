class Lab7Task2Shape {

    double area(double length, double width) {
        return length * width;
    }
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

public class Lab7Task2Main {

    public static void main(String[] args) {

        Lab7Task2Shape shape = new Lab7Task2Shape();

        System.out.println(shape.area(10, 5));
        System.out.println(shape.area(7));
    }
}