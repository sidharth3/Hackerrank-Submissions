#Given an array of integers, return indices of the two numbers such that they add up to a specific target.
#You may assume that each input would have exactly one solution, and you may not use the same element twice.
#Solution runs in O(n) time and O(n) space.
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        newDict = {}
        for i in range(len(nums)):
            temp = target-nums[i]
            if temp in newDict:
                return[newDict[temp], i]
            else:
                newDict[nums[i]] = i
