package Strings;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class TextJustification {
	public ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		ArrayList<String> result = new ArrayList<>();
		int start = 0;
		int end = 0;
		int size = a.size();
		int length = b;
		int i =0;
		while(i < size){
			int entrySize = a.get(i).length();
			if(length - entrySize >= 0){
				length = length - (entrySize + 1);
				end = i;
				i++;
			}else{
				addToList(start, end, a, result, b , false);
				start = i;
				end = i;
				length = b;
			}
		}
		if(length != b){
			addToList(start, end, a, result, b, true);	
		}
		return result;
	}
	
	private void addToList(int start, int end, ArrayList<String> a, ArrayList<String> result, int b, Boolean lastline){
		String addTo = "";
		int l = 0 ;
		for(int i=start; i<=end;i++){
			l = l + a.get(i).length();
		}
		int totalSpaces = b - l;
		int spacesToAdd;
		int extraSpaces;
		if ((end - start) == 0) {
			spacesToAdd = 0;
			extraSpaces = totalSpaces;
		} else {
			spacesToAdd = totalSpaces / (end - start);
			extraSpaces = totalSpaces % (end - start);
		}
		for(int i=start; i<=end - 1;i++){
			addTo = addTo + a.get(i);
			int count = spacesToAdd;
			if(lastline) {
				count = 1;
				totalSpaces--;
			}
			for(int j=0;j<count;j++){
				addTo = addTo + " ";
			}
			if (extraSpaces > 0 && !lastline) {
				addTo = addTo + " ";
				extraSpaces--;
			}
		}

		addTo = addTo + a.get(end);
		if (lastline || (start == end)) {
			for(int j=0;j<totalSpaces;j++){
				addTo = addTo + " ";
			}
		}
		result.add(addTo);	
	}

}
