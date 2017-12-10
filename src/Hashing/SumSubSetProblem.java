package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SumSubSetProblem {
	public ArrayList<ArrayList<Integer>> TwoSumProblem(ArrayList<Integer> a, int target, int start){
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		HashSet<Integer> map = new HashSet<>();
		
		for(int i=start; i<a.size(); i++) {
			int diff = target - a.get(i);
			
			if(map.contains(diff)) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
			 
				temp.add(diff);
				temp.add(a.get(i));
				result.add(temp);
				
			}
			if(!map.contains(a.get(i))){
				map.add(a.get(i));
			}
		}
				
		return result;
		
	}
	
	public ArrayList<ArrayList<Integer>> ThreeSumProblem(ArrayList<Integer> a, int target){
		ArrayList<ArrayList<Integer>> twoSum = null;
		ArrayList<ArrayList<Integer>> threeSum = new ArrayList<>();

		for(int i =0; i<a.size(); i++) {
			int diff = target - a.get(i);
			twoSum = TwoSumProblem(a, diff, i + 1);
			for(ArrayList<Integer> list: twoSum) {
				list.add(a.get(i));
				threeSum.add(list);			
			}
		}
		return threeSum;
	}
	
	public HashMap<Integer, ArrayList<Integer>> sumOfPairs(ArrayList<Integer> a, int target) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		for(int i=0; i<a.size(); i++) {
			for(int j=i+1; j<a.size(); j++) {
				int sum = a.get(i) + a.get(j);
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(a.get(i));
				temp.add(a.get(j));
				map.put(sum, temp);
 			}
		}
		return map;
	}
	
	public ArrayList<ArrayList<Integer>> fourSumProblem(ArrayList<Integer> a, int target) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int i=0; i<a.size(); i++) {
			for(int j=i+1; j<a.size(); j++) {
				int sum = a.get(i) + a.get(j);
				int diff = target - sum;
				
				if(map.containsKey(diff)) {
					ArrayList<Integer> k = new ArrayList<>();
					k.add(map.get(diff).get(0));
					k.add(map.get(diff).get(1));
					k.add(a.get(j));
					k.add(a.get(i));
					result.add(k);
				}
				ArrayList<Integer> temp = new ArrayList<Integer>(); 
				temp.add(diff);
				temp.add(a.get(i));
				map.put(sum, temp);
 			}
		}
		return result;
	}
}
