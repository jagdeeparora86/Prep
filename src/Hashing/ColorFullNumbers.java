package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ColorFullNumbers {
	public int colorful(int number){
		if(number < 10){
			return 1;
		}
		
		String ns = String.valueOf(number);
		int length = ns.length();
		List<Integer> map = new ArrayList<Integer>();
		int resultNumber = doMultiplication(number);
		map.add(resultNumber);
		for(int i = 1; i<length; ++i){
			for(int j=0; j+i <= length; j++){
				String sub = ns.substring(j, j + i);
				resultNumber = doMultiplication(Integer.parseInt(sub));
				if(map.contains(resultNumber)){
					return 0;
				}
				else {
					map.add(resultNumber);
				}
			}
		}
		return 1;
	}
	
	public int doMultiplication(int number){
		if(number < 10)
			return number;
		int num = number;
		int product = 1;
		while(num > 0){
			product = product * (num % 10);
			num = num / 10;
		}
		return product;
	}
	
	
}
