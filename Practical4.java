// Practical 4: Method Overloading and Method Overriding
class Calculator {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }
}

class EmployeePay {
    double calculatePay() { return 0; }
}
class FullTimeEmployee extends EmployeePay {
    double monthlySalary;
    FullTimeEmployee(double monthlySalary) { this.monthlySalary = monthlySalary; }
    @Override double calculatePay() { return monthlySalary; }
}
class PartTimeEmployee extends EmployeePay {
    int hours;
    double hourlyRate;
    PartTimeEmployee(int hours, double hourlyRate) {
        this.hours = hours; this.hourlyRate = hourlyRate;
    }
    @Override double calculatePay() { return hours * hourlyRate; }
}

public class Practical4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("add(2, 3) = " + c.add(2, 3));
        System.out.println("add(2, 3, 4) = " + c.add(2, 3, 4));
        System.out.println("add(2.5, 3.5) = " + c.add(2.5, 3.5));

        EmployeePay e1 = new FullTimeEmployee(50000);
        EmployeePay e2 = new PartTimeEmployee(80, 250);
        System.out.println("Full-time pay: " + e1.calculatePay());
        System.out.println("Part-time pay: " + e2.calculatePay());
    }
}
// Overloading: compile-time polymorphism. Overriding: runtime polymorphism.
