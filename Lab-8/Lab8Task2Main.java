class Lab8Task2Shape {

    void draw() {
        System.out.println("Drawing shape");
    }
}
class Lab8Task2Circle extends Lab8Task2Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Lab8Task2Rectangle extends Lab8Task2Shape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Lab8Task2Main {

    public static void main(String[] args) {

        Lab8Task2Shape shape = new Lab8Task2Shape();
        Lab8Task2Circle circle = new Lab8Task2Circle();
        Lab8Task2Rectangle rectangle = new Lab8Task2Rectangle();

        shape.draw();
        circle.draw();
        rectangle.draw();
    }
}