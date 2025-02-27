import java.util.HashMap;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> numMap = new HashMap<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int difference = target - nums[i];

			if (numMap.containsKey(difference)) {
				return new int[] { numMap.get(difference), i };
			}

			numMap.put(nums[i], i);
		}
		return new int[] {};
	}
}
