import java.util.*;
class greatThree
{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the three numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    
    if(a>b)
    {
      if(a>c)
      {
         System.out.println("Greatest number :  "+a);
      }
       else
       {
         System.out.println("Greatest number :  "+c);   
       }
      }
      else if(b>c)
      {
         System.out.println("Greatest number :  "+b);
      }
       else
       {
         System.out.println("Greatest number :  "+c);
       }
   }
}