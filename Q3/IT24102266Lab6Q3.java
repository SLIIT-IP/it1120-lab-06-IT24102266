import java.util.Scanner;

public class IT24102266Lab6Q3
{
 public static void main(String args[])
 { 

    int number=0 ,count = 1;
    double powerofsquare=0;
    double rootsquare=0;

    Scanner sqr = new Scanner (System.in);
    
    System.out.println("Enter positive intigers (terminate input with -99) :");
       
    while(count<=10)
    {
      
      System.out.print("Enter number " + count + " :");
      number =sqr.nextInt();
     
      if (number==-99)
      {
        break;
      }
      if (number < 0)
      {
        System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
        continue;
      }
      
      powerofsquare+= Math.pow(number, 2);
      count++;
    }
    
      if(count>0)
      {
        rootsquare=Math.sqrt(powerofsquare / count);
        System.out.print("The Root Mean Square (RMS) is: " + rootsquare);
      }

  }
}