package program;

public class Trim {
	public static void main(String[] args) {
		String S ="welcome to java";
		String trim =S.trim().replace(" ", "");
		System.out.println("Remove space = "+trim);
		
		S=S.replaceAll("[aAeEiIoOuU]", "*");
		System.out.println("Replace vowel with star = "+S);
	}

}
