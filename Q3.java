public class Q3
{
	public static void main(String[] args) {
        int line = 10;	 
		int counter = 0;

		
		for (int i = 100; i <= 200; i++) {
			
			if (i % 5 == 0 ^ i % 6 == 0) {
				counter++;	
				
				if (counter % line == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");		
			}
		}	}
}

