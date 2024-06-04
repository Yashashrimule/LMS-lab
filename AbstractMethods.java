//WAP to implement abstract methods for class person(id,name,salary) and subclass manager and Employee .(add your own attributes of choice).

abstract class Person {
    private int id;
    private String name;
    private double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Person {
    private String department;

    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Department: " + department);
    }
}

class Employee extends Person {
    private String designation;

    public Employee(int id, String name, double salary, String designation) {
        super(id, name, salary);
        this.designation = designation;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Designation: " + designation);
    }
}

public class AbstractMethods {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "John Doe", 80000, "Finance");
        Employee employee = new Employee(2, "Jane Smith", 60000, "Software Engineer");

        System.out.println("Manager Information:");
        manager.displayInfo();
        System.out.println();

        System.out.println("Employee Information:");
        employee.displayInfo();
    }
}

