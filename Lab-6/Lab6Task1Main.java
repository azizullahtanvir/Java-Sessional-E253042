class Lab6Task1Grandfather {

    void company() {
        System.out.println("Grandfather: Owns a family company.");
    }
}
class Lab6Task1Father extends Lab6Task1Grandfather {

    void car() {
        System.out.println("Father: Owns a car.");
    }
}
class Lab6Task1Son extends Lab6Task1Father {

    void bike() {
        System.out.println("Son: Owns a bike.");
    }
}

public class Lab6Task1Main {

    public static void main(String[] args) {

        Lab6Task1Son s = new Lab6Task1Son();

        s.company();
        s.car();
        s.bike();
    }
}