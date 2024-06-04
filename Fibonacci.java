// WAP to generate fibonacci series 0 1 1 2 3 5 8.
class Fibonacci 
{   
  public static void main(String args[])
  { 
     int n1=0,n2=1,n3,i;
      System.out.println(n1);
      System.out.println(n2);  
     for (i=1;i<=5;i++)
    {
      n3 = n1+n2;
      n1 = n2;
      n2 = n3;
      System.out.println(n3);
      
     }
    }
     
}