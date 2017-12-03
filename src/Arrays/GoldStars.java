package Arrays;

import java.util.ArrayList;

public class GoldStars {
	public int ratings(ArrayList<Integer> a) {
		int goldStars = a.size();
		ArrayList<Integer> result = new ArrayList<Integer>(a.size());
		for (int i = 0; i < a.size(); i++) {
			result.add(0);
		}
		for (int i = 0; i < a.size() - 1; i++) {
			if (i == 0) {
				if (a.get(i) > a.get(i + 1)) {
					result.set(i, 2);
				} else {
					result.set(i, 1);
				}
			} else if (a.get(i) > a.get(i - 1) && a.get(i) > a.get(i + 1)) {
				result.set(i, result.get(i - 1) + 1);
				result.set(i + 1, 1);
			} else if (a.get(i) > a.get(i - 1) && a.get(i) == a.get(i + 1)) {
				result.set(i, result.get(i - 1) + 1);
				result.set(i + 1, result.get(i));
			} else if (a.get(i) < a.get(i - 1) && a.get(i) < a.get(i + 1)) {
				result.set(i, 1);
				result.set(i + 1, 2);
			} else if (a.get(i) < a.get(i - 1)) {
				result.set(i, 1);
				int j = i;
				while (j < 0) {
					int tempStar = result.get(j - 1);
					if (tempStar == 1) {
						result.set(j - 1, tempStar + 1);
					}
				}
			} else if (a.get(i) < a.get(i + 1)) {
				result.set(i, result.get(i - 1) + 1);
				result.set(i + 1, result.get(i) + 1);
			} else {
				if (a.get(i) == a.get(i - 1)) {
					result.set(i, result.get(i - 1));
				} else if (a.get(i) == a.get(i + 1)) {
					result.set(i + 1, result.get(i));
					
				}
			}
		}

		for (int i = 0; i < result.size(); i++) {
			goldStars = goldStars + result.get(i);
		}

		return goldStars;
	}
}
