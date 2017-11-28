package Arrays;

import java.util.ArrayList;

public class AddOneToNumber {
	public ArrayList<Integer> solution(ArrayList<Integer> a){
		ArrayList<Integer> result = a;
		int carryOn = 1;
		int number;
		while(a.get(0) == 0 && a.size() > 1){
			a.remove(0);
		}
		for(int i=a.size() -1; i>=0; i--){
				number = a.get(i) + carryOn;
				carryOn = number/10;
				int val = number % 10;
				result.set(i, val);
			}
		if(carryOn == 1){
			ArrayList<Integer> anotherResult = new ArrayList<Integer>();
			anotherResult.add(1);
			anotherResult.addAll(result);
			result = anotherResult;
		}
		return result;
	}

}
