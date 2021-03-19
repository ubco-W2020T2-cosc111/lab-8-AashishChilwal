import java.util.Scanner;
public class Q4
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score;
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        String [] name = new String [number] ;
	    double [] score = new double [number];
        for (int i = 0; i<number;i++)
        {
            System.out.println("Enter a student name: "); 
             name[i] = input.nextLine();
            System.out.println("\nEnter a student score");
             score[i] = input.nextDouble();
        }
        for (i=1;i<number;i++)
        {
            if (score[i]>score[i-1])
                highest = score[i];
        }
		}	
}
