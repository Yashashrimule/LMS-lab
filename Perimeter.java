/*Write a class with the name Perimeter using Menu driven(Switch case) that computes the perimeter of a square, a rectangle and a circle.

Formula:

Perimeter of a square = 4 * s

Perimeter of a rectangle = 2 * (l + b)

Perimeter of a circle = 2 * (22/7) * r
*/

import java.util.Scanner;

public class Perimeter
{
   public static void main(String[] args) 
   {
      Scanner scanner = new Scanner(System.in);
      int choice;
      do 
      {
         System.out.println("Menu:");
         System.out.println("1. Perimeter of Square");
         System.out.println("2. Perimeter of Rectangle");
         System.out.println("3. Perimeter of Circle");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();
         switch (choice) 
         {
           case 1:
                  System.out.print("Enter the side length of the square: ");
                  double side = scanner.nextDouble();
                  double squarePerimeter = 4 * side;
                  System.out.println("Perimeter of the square: " + squarePerimeter);
                  break;
           case 2:
                  System.out.print("Enter the length of the rectangle: ");
                  double length = scanner.nextDouble();
                  System.out.print("Enter the breadth of the rectangle: ");
                  double breadth = scanner.nextDouble();
                  double rectanglePerimeter = 2 * (length + breadth);
                  System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                  break;
           case 3:
                  System.out.print("Enter the radius of the circle: ");
                  double radius = scanner.nextDouble();
                  double circlePerimeter = 2 * (22.0 / 7.0) * radius;
                  System.out.println("Perimeter of the circle: " + circlePerimeter);
                  break;
           case 4:
                  System.out.println("Exiting the program.");
                  break;
           default:
                  System.out.println("Invalid choice. Please enter a valid option.");
          }
        } 
        while (choice != 4);

    }
}