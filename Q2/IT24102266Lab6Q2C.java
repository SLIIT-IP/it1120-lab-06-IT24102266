
import java.util.Scanner;

public class IT24102266Lab6Q2C
{
 public static void main(String args[])
 { 
   int num= 1;
   int count =1;
   String aa = " ";
   int total=0;
   double avg;
  
   Scanner nu = new Scanner(System.in);
   System.out.println(" Please enter 10 numbers :");
 
   while (count<=10)
   {
     System.out.print("Enter number " + count + " :");
     num =nu.nextInt();
     aa+=num + " ";
     total+=num;
     count++;
   }    
     avg=total+count;
   
     System.out.println("The numbers you entered are : \n"+ aa);
     System.out.println("Sum of the numbers :" + total);
     System.out.println("Average of the numbers:" + avg); 
  }
}