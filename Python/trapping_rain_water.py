# https://leetcode.com/problems/trapping-rain-water/


class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        water = 0

        highest_left = [0] * len(height)
        highest_right = [0] * len(height)

        highest = height[0]
        for i in range(len(height)):
            highest_left[i] = highest
            highest = max(highest, height[i])

        highest = height[len(height) - 1]
        for i in range(len(height) - 1, 0, -1):
            highest_right[i] = highest
            highest = max(highest, height[i])

        for i in range(1, len(height) - 1):
            if highest_left[i] > height[i] and highest_right[i] > height[i]:
                water += min(highest_left[i], highest_right[i]) - height[i]

        return water
