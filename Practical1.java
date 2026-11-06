// Practical 1: Classes and Objects
class Student {
    int rollNumber;
    String name;
    double marks1, marks2, marks3;

    Student(int rollNumber, String name, double marks1, double marks2, double marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    double totalMarks() { return marks1 + marks2 + marks3; }
    double percentage() { return totalMarks() / 3.0; }

    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name);
        System.out.println("Total: " + totalMarks() + ", Percentage: " + percentage() + "%");
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 85, 90, 88);
        Student s2 = new Student(2, "Riya", 78, 82, 91);
        Student s3 = new Student(3, "Kabir", 92, 89, 95);
        s1.display(); s2.display(); s3.display();
    }
}
// Class: Student; objects: s1, s2, s3; instance variables: fields;
// constructor: Student(...); methods: totalMarks(), percentage(), display().
