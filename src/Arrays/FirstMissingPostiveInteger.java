package Arrays;

import java.util.ArrayList;

public class FirstMissingPostiveInteger {
	public int firstMissingPositive(ArrayList<Integer> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (a.size() == 1) {
			if (a.get(0) == 1) {
				return 2;
			} else {
				return 1;

			}

		}
		for (int i = 0; i < a.size(); i++) {
			result.add(-1);
		}

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > a.size() || a.get(i) <= 0) {
				continue;
			}
			result.set(a.get(i) - 1, a.get(i));
		}
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i) != i + 1) {
				return i + 1;
			}
		}

		return a.size() + 1;

	}

}
