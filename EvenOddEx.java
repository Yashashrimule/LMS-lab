//WAP to generate even and odd numbers between 1 and 100.
public class EvenOddEx  
{  
public static void main(String args[])   
{  
int number=100;  
System.out.print("\n List of even numbers from 1 to "+number+": ");  
for (int i=1; i<=number; i++)   
{  
if (i%2==0)   
{  
System.out.print(i + " ");  
} 
} 

System.out.print("\n List of odd numbers from 1 to "+number+": ");  
for (int i=1; i<=number; i++)   
{  
if (i%2==1)   
{  
System.out.print(i + " ");  
} 
} 

 
}  
}
