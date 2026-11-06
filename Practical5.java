// Practical 5: Simulating Operator Overloading Using Methods
class ComplexNumber {
    double real, imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real; this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    void display() {
        System.out.println(real + (imaginary >= 0 ? " + " : " - ")
                + Math.abs(imaginary) + "i");
    }
}

public class Practical5 {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(4, 3);
        ComplexNumber second = new ComplexNumber(2, -5);
        ComplexNumber sum = first.add(second);
        System.out.print("First: "); first.display();
        System.out.print("Second: "); second.display();
        System.out.print("Sum: "); sum.display();
    }
}
// Java does not let programmers define custom meanings for operators such as +
// for user-defined classes. A method such as add() is used instead.
