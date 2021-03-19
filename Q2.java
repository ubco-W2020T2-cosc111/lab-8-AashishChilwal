public class Q2
{
	public static void main(String[] args) {
	int sum;
	System.out.print("The four perfect numbers are:");
	for (int i=1;i<10000;i++){
	    sum = 0;
	   for (int k = 1; k < i; k++) {
	       if (i % k == 0)
					sum += k;
	   }
	   if (i == sum)
	   System.out.print(" " + i);
	}
	
	}
}
