package program;

public class Ascending_Order {
	public static void main(String[] args) {
		int temp;
		int n[]= {10,100,200,40,20};
		System.out.println("Ascending Order");
		for (int i = 0; i < n.length; i++) {
		System.out.print(n[i]+" ");
	}
		for (int j = 0; j < n.length; j++) {
			for (int k = j+1; k < n.length; k++) {
				while (n[j]>n[k]) {
					temp=n[j];
					n[j]=n[k];
					n[k]=temp;
				}
			}}
		System.out.println();
		System.out.println("Order Ascending Order");
			for (int i = 0; i < n.length; i++) {
				System.out.println(n[i]+" ");
		}
			
			System.out.println();
			int maximumnumber = n[n.length - 3];
			System.out.println("Maximum Number is "+maximumnumber);
			
			int twomaximumnumbers = n[n.length -2];
			System.out.println("Maximum number is "+twomaximumnumbers);
			
			int thridmaximumnumber =n[n.length -1];
			System.out.println("maximumnumber is "+thridmaximumnumber);
			
			int mininumber = n[n.length -4];
			System.out.println("maximumnumber is "+mininumber);
			
			int mininumbers = n[0];
			System.out.println("mininumbers is "+mininumbers);
			
			
			
			System.out.println();
			System.out.println("Descending Order");
			int a[]= {10,100,200,40,20};
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			for (int j = 0; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					while (a[j]<a[k]) {
						temp=a[j];
						a[j]=a[k];
						a[k]=temp;
						
					}
					
				}
			}
			System.out.println();
			System.out.println("Oringial Descending Order");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]+" ");
				
			}
			
	}
}
