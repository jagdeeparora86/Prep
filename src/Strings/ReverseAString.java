package Strings;

public class ReverseAString {
	public String reverseWords(String a) {
		if(a.length() == 0 || a == null){
			return "";
		}
		String[] array = a.split(" ");
		StringBuilder sb = new StringBuilder();
			
		for(int i=array.length - 1; i>=0; i--){
			if(!array[i].equals("")){
				sb.append(array[i]);
				sb.append(" ");
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
