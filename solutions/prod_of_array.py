class Solution:
    def productExceptSelf(nums: list[int]) -> list[int]:
        n = len(nums)
        postfix = 1
        prefix = 1
        result = [0]*n

        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]

        for i in range(n-1, -1 ,-1):
            result[i] *= postfix
            postfix *= nums[i]

        return result

    print(productExceptSelf([1,2,3,4]))
    


