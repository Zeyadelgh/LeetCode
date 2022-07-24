/*
 * Runtime: 11 ms, faster than 68.00% of Java online submissions for Contains Duplicate.
 * Memory Usage: 69.9 MB, less than 43.87% of Java online submissions for Contains Duplicate.
 */

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {
		
		Map<Integer, Integer> ht1= new HashMap<Integer, Integer>();
		Integer check = null;

		for (int i = 0; i < nums.length; i++ ) {
			check = ht1.put(nums[i], i);
			if (check != null) {
				return true;
			}
		}
		return false;

	}
}
