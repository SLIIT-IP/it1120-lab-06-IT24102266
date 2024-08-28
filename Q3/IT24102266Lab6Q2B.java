import java.util.Scanner;

public class IT24102266Lab6Q2B
{
 public static void main(String args[])
 { 
   int num= 1;
   int count =1;
   String aa = " ";  
   Scanner nu = new Scanner(System.in);
   System.out.println(" Please enter 10 numbers :");
 
   while (count<=10)
   {
     System.out.print("Enter number " + count + " :");
     num =nu.nextInt();
     aa+=num + " ";
     count++;
   }    
   
     System.out.print("The numbers you entered are : \n"+ aa);
    
   
  }
}