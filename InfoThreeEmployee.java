/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/
class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String n, int y, double s, String a) {
        name = n;
        yearOfJoining = y;
        salary = s;
        address = a;
    }

    void displayInfo() {
        System.out.printf("%-10s %-20d %-20s%n", name, yearOfJoining, address);
    }
}

public class InfoThreeEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 50000, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, 60000, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, 55000, "26B- WallsStreat");

        System.out.println("Name        Year of joining        Address");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}