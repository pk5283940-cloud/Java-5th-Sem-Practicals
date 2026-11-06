// Practical 9: this Keyword, Constructor Chaining, and Static Members
class Employee {
    String employeeName;
    double salary;
    static int employeeCount = 0;

    Employee() {
        this("Not Assigned", 0.0);
    }
    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }
    static void displayCount() {
        System.out.println("Total employees created: " + employeeCount);
    }
    void display() {
        System.out.println(employeeName + " | Salary: " + salary);
    }
}

public class Practical9 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Neha", 35000);
        Employee e3 = new Employee("Arjun", 42000);
        e1.display(); e2.display(); e3.display();
        Employee.displayCount();
    }
}
// this.field refers to the current object's field. this() calls another
// constructor in the same class and must be the first constructor statement.
// static employeeCount belongs to the class, not an individual object.
