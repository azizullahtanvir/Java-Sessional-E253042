class Lab4Task1Car {

    String brand;
    String model;
    double price;

    Car(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }


    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Corolla", 2500000);

        c1.displayCar();
    }
}