/*Create a class Student having roll_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks .Apply Single Inheritance to display the result*/

import java.util.Scanner;

class Student {
    int rollNumber;
    String name;

    //Constructor
    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    
    //method to display the rollnumber and name
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

class MarksDetails extends Student {
    int[] marks;

    MarksDetails(int rollNumber, String name) {
        super(rollNumber, name);
        marks = new int[5];   //stored 5 subject marks
    }

    
    //Accepting the 5 subject marks from user
    void acceptMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }
    }

    
    //displaying the 5 subject marks
    void displayResult() {
        displayDetails();
        System.out.println("Marks of 5 Subject:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

public class SingleInheritanceResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Roll Number: ");
        
        int rollNumber = sc.nextInt();
        sc.nextLine(); // Consume newline character
        
        System.out.print("Name: ");
        String name = sc.nextLine();

        MarksDetails obj = new MarksDetails(rollNumber, name);
        obj.acceptMarks();

        System.out.println("\nStudent Result:");
        
        obj.displayResult();
    }
}