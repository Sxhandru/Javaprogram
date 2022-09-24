package program;

import java.util.Scanner;

public class Amstrong_Number {
	public static void main(String[] args) {
		
		int a,n,i=0,j=0;
		Scanner value = new  Scanner(System.in);
		System.out.println("Enter the Number");
		n=value.nextInt();
		a=n;
		while (a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(n==j) {
		System.out.println("Amstrong");
	}
		else {
			System.out.println("Not Amstrong");
		}	
	
	
		
	
	
	}

}
