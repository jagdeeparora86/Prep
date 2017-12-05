package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWoutRepeat {
	public int lengthOfLongestSubstring(String s) {
		if(s==null || s.length()==0){
	        return 0;
	    }
	 
	    int start=0;
	    int max = 0;
	 
	    HashSet<Character> set = new HashSet<Character>();
	    for(int i=0; i<s.length(); i++){
	        char c = s.charAt(i);
	 
	        if(!set.contains(c)){
	            set.add(c);
	 
	            max = Math.max(max, i-start+1);
	        }else{
	            for(int j=start; j<i; j++){
	                set.remove(s.charAt(j));
	 
	                if(s.charAt(j)==c){
	                    start=j+1;
	                    break;    
	                }
	            }        
	 
	            set.add(c);
	        }
	    }
	 
	    return max;
	}
}
