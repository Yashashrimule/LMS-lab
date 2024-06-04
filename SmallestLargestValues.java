/*Write a program that asks the user to input ten integers and stores them in an array.The program should then find and print the smallest and largest values in the array.*/


import java.util.Scanner;

public class SmallestLargestValues {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store the integers
        int[] numbers = new int[10];
        
        // Prompt the user to input ten integers
        System.out.println("Please enter ten integers, one at a time:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Find the smallest and largest values in the array
        int smallest = numbers[0];
        int largest = numbers[0];
        
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        // Print the smallest and largest values
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}