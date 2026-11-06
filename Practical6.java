// Practical 6: Default, Parameterized, and Copy Constructors
class Book {
    String title, author;
    double price;

    Book() {
        this("Unknown", "Unknown", 0.0);
    }
    Book(String title, String author, double price) {
        this.title = title; this.author = author; this.price = price;
    }
    Book(Book other) {
        this(other.title, other.author, other.price);
    }
    void display() {
        System.out.println(title + " | " + author + " | Rs. " + price);
    }
}

public class Practical6 {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book original = new Book("Java Basics", "A. Sharma", 450);
        Book copied = new Book(original);

        defaultBook.display(); original.display(); copied.display();
        copied.price = 500;
        System.out.println("After changing copied book:");
        System.out.print("Original: "); original.display();
        System.out.print("Copy: "); copied.display();
    }
}
// No-argument constructor supplies defaults; parameterized constructor accepts
// values; copy constructor initializes a new object from another Book object.
// Changing copied.price does not change original.price because price is a
// primitive field and the objects are separate.
