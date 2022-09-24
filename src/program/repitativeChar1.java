package program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repitativeChar1 {
	public static void main(String[] args) {
		String S ="welcome god god god here here where";
		String[] allwords = S.split(" ");
		Map<String, Integer> C = new LinkedHashMap<String,Integer>();
		
		for (String words : allwords) {
			if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
        Set<Entry<String,Integer>> entryset =C.entrySet();
        for (Entry<String, Integer> entry : entryset) {
        	if (entry.getValue()>1) {
				String Key = entry.getKey();
				Integer Value =entry.getValue();
				System.out.println(Key + "=" +Value);
				
			}
			
		}
	}

}
