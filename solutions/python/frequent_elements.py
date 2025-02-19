class Solution:
    def topKFrequent(nums: list[int], k: int) -> list[int]:
        nums_dict = {}

        for i in nums:
            if i not in nums_dict:
                nums_dict[i] = 0
            nums_dict[i] += 1
        
        sorted_tuple = sorted(nums_dict.items(), key = lambda item: item[1], reverse = True)
        sorted_dict = {k: v for k,v in sorted_tuple}
        
        ans = list(sorted_dict.keys())

        return ans[:k]

    
    print(topKFrequent((1,1,1,2,2,3), 2))