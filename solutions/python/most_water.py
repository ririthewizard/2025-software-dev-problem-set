class Solution:
    def max_area(self, height: list[int]) -> int:
        max_water = 0
        left = 0
        right = len(height) - 1

        while left < right:
            max_water = max(max_water, (right-left) * min(height[left], height[right]))

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_water;
