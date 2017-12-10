package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		HashMap<String, ArrayList<Integer>> dict = new HashMap<>();
		for(int i=0; i<a.size(); i++){
			String s = a.get(i);
			char [] chars = s.toCharArray();
			Arrays.sort(chars);
			String sortedString = String.valueOf(chars);
			if(dict.containsKey(sortedString)){
				ArrayList<Integer> list = dict.get(sortedString);
				list.add(i + 1);
	
			}
			else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i + 1);
				dict.put(sortedString, list);
			}
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> list : dict.values()){
			result.add(list);
		}
		return result;
	}
}
