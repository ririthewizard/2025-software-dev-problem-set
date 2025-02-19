class Solution:
    def two_sum(numbers: list[int], target:int) -> list[int]:
        left = 0
        right = len(numbers) - 1

        while left < right:
            combined = numbers[left] + numbers[right]
            if combined == target:
                return [left + 1, right + 1]
            elif combined < target:
                left += 1
            elif combined > target:
                right -= 1


    print(two_sum([2,7,11,15], 9))
    print(two_sum([2,3, 4], 6))
    print(two_sum([-1, 0], -1))
