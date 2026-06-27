class Lab9Task1Student {

    private String name;
    private String id;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Lab9Task1Main {

    public static void main(String[] args) {

        Lab9Task1Student s1 = new Lab9Task1Student();

        s1.setName("Tanvir");
        s1.setId("E253042");
        s1.setCgpa(3.025);

        System.out.println("Student Information:");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("CGPA: " + s1.getCgpa());
    }
}