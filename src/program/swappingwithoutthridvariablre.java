package program;

public class swappingwithoutthridvariablre {
	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("Orinigal Value");
		System.out.println(a);
		System.out.println(b);
		System.out.println("Swap Value");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
