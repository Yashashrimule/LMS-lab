//Wap to check whether the entered number is prime or not.
import java.util.*;
public class Prime
{
   public static void main(String[] args)
   {
      int count = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number : ");
      int num = sc.nextInt();
      if(num == 2) 
      {
         System.out.println(num + " is a prime number");
      } 
      else 
      {
         for(int i = 1; i <= num; i++) 
         {
            if(num % i == 0) 
            {
               count++;
            }
         }
         if(count == 2) 
         {
            System.out.println(num + " is a prime number");
         } 
         else 
         {
            System.out.println(num + " is not a prime number");
         }
      }
   }
}