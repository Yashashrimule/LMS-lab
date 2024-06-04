/*Write a program in Java to accept the name of an employee and his/her annual income. Pass the name and the annual income. Displays the name of the employee and the income tax as per the given tariff.*/

import java.util.Scanner;

public class IncomeTaxCalculator 
{
   public static void main(String[] args) 
   {
     Scanner scanner = new Scanner(System.in);
     // Accepting employee name
     System.out.print("Enter the name of the employee: ");
     String name = scanner.nextLine();

     // Accepting annual income
     System.out.print("Enter the annual income of " + name + " (in ₹): ");
     double income = scanner.nextDouble();

     // Calculating income tax
     double tax = calculateTax(income);

     // Displaying name and income tax
     System.out.println("Name: " + name);
     System.out.println("Income Tax: ₹" + tax);
    }

      public static double calculateTax(double income) 
      {
        double tax = 0;
        if (income <= 250000) 
        {
            tax = 0;
        } 
        else if (income <= 500000) 
        {
            tax = (income - 250000) * 0.1;
        } 
        else if (income <= 1000000) 
        {
            tax = 30000 + (income - 500000) * 0.2;
        } 
        else 
        {
            tax = 50000 + (income - 1000000) * 0.3;
        }

        return tax;
       }
  }