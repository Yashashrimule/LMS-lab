//WAP to swap two numbers without using third variable using class and object concept.
import java.util.*;
class Swap
{
  public static void main(String args[])
  { 

    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Before Swapping : a="+a+" b="+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After Swapping : a="+a+" b="+b);
   }
}
  