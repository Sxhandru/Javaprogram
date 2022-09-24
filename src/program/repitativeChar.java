package program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repitativeChar {
	public static void main(String[] args) {
		String S ="welcomegod";
		String[] allwords = S.split("");
		Map<String, Integer> C= new LinkedHashMap<String, Integer>();
		for (String words : allwords) {
			if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
        Set<Entry<String,Integer>> entryset = C.entrySet();
        System.out.println("List of Duplicate Characters");
        for (Entry<String, Integer> entry : entryset) {
        	if (entry.getValue()>1) {
        		String key =entry.getKey();
        		Integer value =entry.getValue();
        		System.out.println(key + "="+ value);
			}
			
		}
        
        
		}

}
