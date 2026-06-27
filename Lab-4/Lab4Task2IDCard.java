class Lab4Task2IDCard {

    String name;
    String id;
    String department;
    String institution;

    Lab4Task2IDCard(String n, String i, String d, String ins) {
        name = n;
        id = i;
        department = d;
        institution = ins;
    }
    void showID() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
    }

    public static void main(String[] args) {

        Lab4Task2IDCard card1 = new Lab4Task2IDCard("Tanvir", "E253042", "CCE", "IIUC");
        card1.showID();
    }
}