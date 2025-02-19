class Solution:
    def twoSum(nums: list[int], target: int) -> list[int]:
        numMap = {} # val -> index

        for i, n in enumerate(nums):
            difference = target - n
            

            if difference in numMap:
                return [numMap[difference], i]

            numMap[n] = i

        #for i in range(len(nums)):
            #for j in range(len(nums)):
                #if j == i:
                    #break
                #if nums[i] + nums[j] == target:
                    #return [i,j]