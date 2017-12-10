package Hashing;

import java.util.HashMap;

public class FindFirstRepeat {
	public String findWord(String s){
		String[] strings = s.split("\\W+");
		HashMap<String, Integer> hs = new HashMap<>();
		for(String t: strings){
			if(hs.containsKey(t.toLowerCase())){
				return t;
			}else {
				hs.put(t.toLowerCase(), 1);
			}
		}
		return s;
	}
}
