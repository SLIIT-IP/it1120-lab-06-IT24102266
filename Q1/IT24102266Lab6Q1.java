import java.util.Scanner;

public class IT24102266Lab6Q1
{
 public static void main(String args[])
 { 
   int num;
   double square , square_root ;
    
   Scanner aa = new Scanner(System.in);
   
   System.out.print("Enter a number :");
   num = aa.nextInt();
  
   square = Math.pow(num, 2);
   square_root = Math.sqrt(num);
   
   
     System.out.println("The square of "+ num + " is " + square);
     System.out.println("The square root of "+ num + " is " +  square_root);
 }
}