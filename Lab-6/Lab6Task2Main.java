class Lab6Task2Person {

    void displayInfo() {
        System.out.println("This is a person.");
    }
}
class Lab6Task2Doctor extends Lab6Task2Person {

    void work() {
        System.out.println("Doctor: Treats patients.");
    }
}
class Lab6Task2Teacher extends Lab6Task2Person {

    void teach() {
        System.out.println("Teacher: Teaches students.");
    }
}
class Lab6Task2Engineer extends Lab6Task2Person {

    void build() {
        System.out.println("Engineer: Builds systems and structures.");
    }
}
public class Lab6Task2Main {

    public static void main(String[] args) {

        Lab6Task2Doctor d = new Lab6Task2Doctor();
        Lab6Task2Teacher t = new Lab6Task2Teacher();
        Lab6Task2Engineer e = new Lab6Task2Engineer();

        d.displayInfo();
        d.work();

        t.displayInfo();
        t.teach();

        e.displayInfo();
        e.build();
    }
}