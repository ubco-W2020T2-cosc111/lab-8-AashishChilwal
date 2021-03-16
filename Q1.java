import java.lang.Math.*;
import java.util.Scanner;
public class Q1
 {
	public static void main(String[] args) {
	    double average = 0,sum = 0;
	    int numlength = 0,positive = 0,negative = 0,even = 0,odd=0,i=1;
	    double numbers [] = new double [i];
	    Scanner input = new Scanner(System.in);
	    do
		{
		    System.out.print("Enter the first integer (0 to terminate): ");
		    numbers[i] = input.nextInt();
		    if (numbers [i] == 0)
		        break;
		     numlength++;
		     sum = sum+numbers[i];
		} while(true);
		average = sum/numlength ; 
		for (i = 0;i<numlength;i++)
		{
		  if (numbers[i] >= 0){
		    positive++;
		  }
		  else{
		    negative++;
		      
		  }
		  if (numbers[i] % 2 == 0 )
		  {
		      even ++;
		  }
		  else
		  {
		      odd ++;
		  }
		        
		}
		System.out.println("The number of positives is "+ positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The number of evens is " + even);
		System.out.println("The number of odds is " + odd);
		System.out.println("The total is " + numlength);
		System.out.println("Average: " + average);
	 }
 }
