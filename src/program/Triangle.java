package program;

public class Triangle {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i1 = 0; i1 <=10; i1++) {
			for (int j1 = 1; j1 <=i1; j1++) {
				if (i1%2==0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		int n=10;
		for (int i2 = 1; i2 <=n; i2++) {
			for (int j2 =n-1 ; j2 >=i2; j2--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i3 = 1; i3 <=5; i3++) {
			for (int j3 = 1; j3 <=i3; j3++) {
				System.out.print(j3);
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		for (int i4 = 1; i4 <=6; i4++) {
			for (int j4 = 5; j4 >=i4; j4--) {
				System.out.print(i4);
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		for (int i5 = 1; i5 <=5; i5+=2) {
			for (int j5 = 1; i5 <=i5; i5++) {
				System.out.print(i5+" ");	
				}
				System.out.println();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


