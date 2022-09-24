package program;

public class Amstrong_number_1_to_1000 {
	public static void main(String[] args) {
		int c=0;
		for (int n = 1; n <=1000; n++) {
			int a=n,i=0,j=0;
			while (a>0) {
				i=a%10;
				j=(i*i*i)+j;
				a=a/10;
			}
			if (n==j) {
				System.out.println("armstrong number is = "+j);
			}
		}
		System.out.println("count of armstrong number is = "+c);
	}

}
