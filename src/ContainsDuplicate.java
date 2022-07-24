/*
 * Challenge:
 * 		Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * Constraints:
 * 		1 <= nums.length <= 10^5
 *		-10^9 <= nums[i] <= 10^9
 *
 * Runtime:
 * 		 11 ms, faster than 68.00% of Java online submissions for Contains Duplicate.
 * 		 Memory Usage: 69.9 MB, less than 43.87% of Java online submissions for Contains Duplicate.
 * 
 * I decided to use a HashMap because of the contstraint 1 <= nums.length <= 10^5. Doing a traditional loop would take too long.
 * In the HashMap, the put method returns null if the key is unique or new, assuming there is no null keys else it returns the previous key.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {

		Map<Integer, Integer> ht1 = new HashMap<Integer, Integer>();
		Integer check = null;

		for (int i = 0; i < nums.length; i++) {
			ht1.put(nums[i], i);
			if (ht1.containsKey(nums[i])) {
				return true;
			}
		}
		return false;

	}
}
