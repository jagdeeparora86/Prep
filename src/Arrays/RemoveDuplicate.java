package Arrays;

import java.util.ArrayList;

public class RemoveDuplicate {
	public int removeDuplicates(ArrayList<Integer> A) {
		int index = 1;
		int n = A.size();

		if (A == null || A.size() == 0)
			return 0;

		for (int i = 1; i < n; i++) {

			if (A.get(i).intValue() != A.get(i - 1).intValue()) {
				int temp = A.get(index);
				A.set(index, A.get(i));
				index++;
			}
		}
		for(int j=index; j<A.size();j++){
			A.set(j, 0);
		}
		for(int i =0;i<A.size();i++){
			System.out.print(A.get(i) + ", ");
		}
		return index;

	}
	
	public int removeDuplicateFromGeeks(int arr[]){
		int n=arr.length;
		 if (n==0 || n==1)
	            return n;
	      
	        // To store index of next unique element
	        int j = 0;
	      
	        // Doing same as done in Method 1
	        // Just maintaining another updated index i.e. j
	        for (int i=0; i < n-1; i++)
	            if (arr[i] != arr[i+1])
	                arr[j++] = arr[i];
	      
	        arr[j++] = arr[n-1];
	      for(int k=j;k<arr.length; k++){
	    	  arr[k] = 0;
	      }
	      
	      for(int l=0;l<arr.length;l++){
	    	  System.out.print(arr[l] + ", ");
	      }
	        return j;
	}
}
