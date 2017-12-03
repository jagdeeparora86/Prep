package Strings;

public class LongestPalindromeSubString {

	public String longestPalindrome(String str){
		char[] strArray = str.toCharArray();
		int length = strArray.length;
		int maxLength = 1;
		int start = 0;
		for(int i=1;i<length;i++){
			int low = i-1;
			int high = i;
			//check for even length
			while(low >=0 && high < length && strArray[low] == strArray[high]){
				if(high - low + 1 > maxLength){
					start = low;
					maxLength = high - low + 1;
				}
				low--;
				high++;
			}
			
			//checking for odd length palindrome.
			low = i-1;
			high = i+1;
			while(low >=0 && high < length && strArray[low] == strArray[high]){
				if(high - low + 1 > maxLength){
					start = low;
					maxLength = high - low + 1;
				}
				low--;
				high++;
			}
		}
		String result = getSubString(str, start, start + maxLength - 1);
		return result;
	}
	
	private String getSubString(String str, int start, int end){
		return str.substring(start, end + 1);
	}
}
