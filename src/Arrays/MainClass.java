package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new  ArrayList<Integer>(Arrays.asList(9, 9, 9));
		AddOneToNumber addOneToNumber = new AddOneToNumber();
		addOneToNumber.solution(numbers);
	}

}
