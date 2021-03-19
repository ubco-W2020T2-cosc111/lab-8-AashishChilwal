import java.lang.Math.*;
import java.util.Scanner;
public class Q1
 {
	public static void main(String[] args) {
	    double average = 0,sum = 0;
	    int numlength = 0,positive = 0,negative = 0,even = 0,odd=0,i=100;
	    double numbers;
	    Scanner input = new Scanner(System.in);
	   System.out.print("Enter the first integer (0 to terminate): ");
	   numbers = input.nextInt();
	   numlength++;
		     sum = sum+numbers;
		     	average = sum/numlength ; 
		  if (numbers >= 0){
		    positive++;
		  }
		  else{
		    negative++;
		      }
		  if (numbers % 2 == 0 )
		  {
		      even ++;
		  }
		  else
		  {
		      odd ++;
		  }
	   if (numbers!=0){
	   while(numbers !=0)
		{
		    System.out.print("Enter the first integer (0 to terminate): ");
		    numbers = input.nextInt();
		    if (numbers == 0)
		        break;
		     numlength++;
		     sum = sum+numbers;
		     	average = sum/numlength ; 
		  if (numbers >= 0){
		    positive++;
		  }
		  else{
		    negative++;
		      }
		  if (numbers % 2 == 0 )
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
		System.out.println("The total is " + sum);
		System.out.println("Average: " + average);
	   }
	   else
	        System.out.println("No numbers are inputted except 0");
	 }
 }
