class Lab5Task2LibraryBook {

    String title;
    String author;
    int bookID;

    Lab5Task2LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }
    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
    }
}
public class Lab5Task2Main {

    public static void main(String[] args) {

        Lab5Task2LibraryBook b1 = new Lab5Task2LibraryBook("Java Basics", "Tanim", 201);
        Lab5Task2LibraryBook b2 = new Lab5Task2LibraryBook("OOP Concept", "Tanvir", 202);

        b1.displayBookInfo();
        b2.displayBookInfo();
    }
}