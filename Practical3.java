// Practical 3: Multiple and Hybrid Inheritance Using Interfaces
interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
class AllInOnePrinter implements Printable, Scannable {
    public void print() { System.out.println("Printing document"); }
    public void scan() { System.out.println("Scanning document"); }
}

// Hybrid structure: class inheritance combined with interface implementation.
class Machine {
    void switchOn() { System.out.println("Machine switched on"); }
}
class SmartPrinter extends Machine implements Printable {
    public void print() { System.out.println("Smart printer is printing"); }
}

public class Practical3 {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print(); printer.scan();

        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.switchOn(); smartPrinter.print();
    }
}
// Java classes cannot extend multiple classes because it can create ambiguity
// (for example, conflicting inherited implementations). A class can implement
// multiple interfaces and provide the required method implementations.
