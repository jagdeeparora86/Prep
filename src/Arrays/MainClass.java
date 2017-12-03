package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new  ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
//		AddOneToNumber addOneToNumber = new AddOneToNumber();
//		addOneToNumber.solution(numbers);
		MaxContigousSum maxSum = new MaxContigousSum();
//		maxSum.maxSubArray(numbers);
		RemoveDuplicate removeDuplicate = new RemoveDuplicate();
//		removeDuplicate.removeDuplicates(numbers);
		
		int[] testArray = {1,2,2};
//		removeDuplicate.removeDuplicateFromGeeks(testArray);
		GoldStars gs = new GoldStars();
//		System.out.println(gs.ratings(numbers));
		FirstMissingPostiveInteger fm = new FirstMissingPostiveInteger();
		System.out.println(fm.firstMissingPositive(numbers));
	}

}
