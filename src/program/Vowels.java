package program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Vowels {
	public static void main(String[] args) {
		int vowels=0, nonvowels=0;
		String S = "welcome to java class";
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch=='A'|| ch=='a' || ch=='E' || ch== 'e' || ch== 'I' || ch=='i' || ch== 'O' || ch=='o' || ch=='U' || ch=='u') {
			vowels++;	
			}
		
			else {
				nonvowels++;
			}
			}
		
		
		
		String[] allwords = S.split("");
		Map<String, Integer> C = new LinkedHashMap<String,Integer>();
		Map<String, Integer> H = new LinkedHashMap<String,Integer>();
		
			if(C.get(C)==null) {
				C.put(C, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
		System.out.println(C);
		
		
		
		System.out.println("Non vowels and count");
		Set<Entry<String,Integer>> entry = nonvowels.entrySet();
		for (Entry<String, Integer> entryset : entry) {
				String key = entryset.getKey();
				Integer value = entryset.getValue();
				System.out.println(key +"=" +value);
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Total Number of vowels"+vowels);
		System.out.println("Total Number of Nonvowels"+nonvowels);	
		
		
		
		}
	}


