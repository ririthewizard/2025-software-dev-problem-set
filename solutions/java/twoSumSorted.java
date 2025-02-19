class Solution {
    public int[] twoSum(int[] numbers, int target) {
	int left = 0;
	int right = numbers.length - 1;

	while (left < right) {
	    int combined = numbers[left] + numbers[right];

	    if (combined == target) {
		return new int[]{left + 1, right + 1};
	    } else if (combined < target) {
		left++;
	    } else if (combined > target) {
		right--;
	    }
	}
	return new int[]{-1, -1};
    }
}
