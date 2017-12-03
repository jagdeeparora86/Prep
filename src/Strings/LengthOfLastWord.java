package Strings;

public class LengthOfLastWord {
	public int lengthOfLastWord(final String a) {
	    char[] str = a.toCharArray();
	    if(a.isEmpty()){
	        return 0;
	    }
	    StringBuilder sb = new StringBuilder();
	    int lastIndex = str.length - 1;
	    if(Character.isWhitespace(str[lastIndex])){
	        while( lastIndex >= 0 && Character.isWhitespace(str[lastIndex])){
	            lastIndex--;
	        }
	    }
	    while(lastIndex >= 0 && !Character.isWhitespace(str[lastIndex])){
	        sb.append(str[lastIndex]);
	        lastIndex--;
	    }
	    return sb.toString().length();
	}
}
