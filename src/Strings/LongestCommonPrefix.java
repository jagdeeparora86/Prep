package Strings;

import java.util.ArrayList;

public class LongestCommonPrefix {
	public String longetCommonPrefix(ArrayList<String> a){
		String lcp = "";
		String first = a.get(0);
		if(first.isEmpty()){
			return lcp;
		}
		
		if(a.size() == 1){
			return a.get(0);
		}
		
		lcp = findLcpinTwoStrings(first, a.get(1));
		
		for(int i=2;i<a.size();i++){
			if(a.get(i).isEmpty()){
				return ""; 
			}
			lcp = findLcpinTwoStrings(lcp, a.get(i));
		}
		return lcp;
	}
	
	private String findLcpinTwoStrings(String first, String second){
		char[] firstArry = first.toCharArray();
		char[] secondArry = second.toCharArray();
		int lcp = -1;
		for(int i=0; i<first.length() && i<second.length(); i++){
			if(firstArry[i] == secondArry[i]){
				lcp = i;
			}else{
				break;
			}
		}

		return first.substring(0, lcp + 1);
	}
}
