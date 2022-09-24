package program;

public class Evenodd {
	public static void main(String[] args) {
		int  c=0;
		System.out.println("Even Number" );
		for (int i = 0; i <30; i++) {
			if (i%2==0) {
				System.out.println(i+" ");
				c++;
			}
		}
		System.out.println("Total number of Even"+c);
	}

}
