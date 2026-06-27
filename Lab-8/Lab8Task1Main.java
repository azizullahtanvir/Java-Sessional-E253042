class Lab8Task1Animal {

    void sound() {
        System.out.println("Some generic sound");
    }
}
class Lab8Task1Dog extends Lab8Task1Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Lab8Task1Cat extends Lab8Task1Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Lab8Task1Main {

    public static void main(String[] args) {

        Lab8Task1Animal animal = new Lab8Task1Animal();
        Lab8Task1Dog dog = new Lab8Task1Dog();
        Lab8Task1Cat cat = new Lab8Task1Cat();

        animal.sound();
        dog.sound();
        cat.sound();
    }
}