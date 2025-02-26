import java.io.*;
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
	Hashtable<Integer, Integer> ht = new Hashtable();

	for (int i = 0; i < nums.length; i++) {
	    if (ht.containsKey(nums[i]) && ht.get(nums[i]) >= 1) {
		return true;
	    }
	    ht.put(nums[i], ht.getOrDefault(nums[i], 0) + 1);
	}
	return false;
    }


    System.out.println(containsDuplicate([1,2,3,1]))
}
