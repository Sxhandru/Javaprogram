package program;

public class Oddnumber {
	public static void main(String[] args) {
		int c=0;
		System.out.println("Odd number");
		for (int i = 1; i <30; i++) {
			if (i%2==1) {
				System.out.println(i+" ");
				c++;
			}
		}
		System.out.println("Total Number of Even number"+c);
	}

}
