/*Create an interface called "Person" with a method called "speak". Create two classes  called "Student" and "Teacher" that implement  the Person interface and implement the "speak" method. Create objects of both the Student and  Teacher classes and call their respective "speak"  methods.*/
// Define the Person interface
interface Person {
    void speak();
}

// Implement the Student class
class Student implements Person {
    @Override
    public void speak() {
        System.out.println("I am a student.");
    }
}

// Implement the Teacher class
class Teacher implements Person {
    @Override
    public void speak() {
        System.out.println("I am a teacher.");
    }
}

// Main class to test the implementation
public class Maintest {
    public static void main(String[] args) {
        // Create objects of both Student and Teacher classes
        Student student = new Student();
        Teacher teacher = new Teacher();
        
        // Call the speak method for both objects
        student.speak();
        teacher.speak();
    }
}