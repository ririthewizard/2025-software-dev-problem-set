class Solution:
    def longest_consecutive(nums: list[int]) -> int:
        count = 0
        
        for i in range(0, len(nums)):
            if i + 1 in nums:
                count += 1

        return count
    
    rand = [1,2,0,1]
    rand2 = [0,3,7,2,5,8,4,6,0,1]
    rand3 = [100,4,200,1,3,2]
    rand4 = [0,0]

    print(longest_consecutive(rand))
    print(longest_consecutive(rand2))
    print(longest_consecutive(rand3))
    print(longest_consecutive(rand4))

