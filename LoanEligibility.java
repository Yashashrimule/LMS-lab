import java.util.Scanner;

public class LoanEligibility 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the person's salary: ");
    double salary = scanner.nextDouble();
    System.out.println("Is the person a citizen of INDIA? (true/false): ");
    boolean isIndian = scanner.nextBoolean();
    if (salary > 50000 && isIndian) 
    {
       System.out.println("Congratulations! The person is eligible for a loan.");
    } 
    else 
    {
       System.out.println("Sorry, the person is not eligible for a loan.");
    }

       
   }
}