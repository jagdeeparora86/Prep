package Arrays;

import java.util.List;

public class MaxContigousSum {
	public int maxSubArray(final List<Integer> a) {
		int maxSum = a.get(0);
		int currentSum = 0;

		for (int i = 0; i < a.size(); i++) {
			currentSum = currentSum + a.get(i);
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}

		}
		return maxSum;

	}
}
