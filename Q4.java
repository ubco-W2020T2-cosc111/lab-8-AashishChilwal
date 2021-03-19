import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();

		int score,h = 0,h1 = 0;	
		String name = "", Hs = "",Hs1 = "";	
		
		for (int i = 0; i < number; i++) {
			System.out.print("Enter a student name: ");
			name = input.next();
			System.out.print("Enter a student score: ");
			score = input.nextInt();

			if (i == 0) {
				h = score;
				Hs = name;
			}
			else if (i == 1 && score > h) {
				h1 = h;
				h = score;
				Hs1 = Hs;
				Hs = name;
			}
			else if (i == 1) {
				h1 = score;
				Hs1 = name;
			}		
			else if (i > 1 && score > h && score > h1) {
			
				h1 = h;
				Hs1 = Hs;
				h = score;
				Hs = name;
			}
			else if (i > 1 && score > h1) {
			 
				Hs1 = name;
				h1 = score;
			}
		}

		System.out.println("Top two students: ");
		System.out.println(Hs+"'s score is "+h);
	    System.out.println(Hs1+"'s score is "+h1);
	    
	}
}

