from typing import Dict, List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []


class Solution1:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashtable = dict()
        for i in range(len(nums)):
            if target - nums[i] in hashtable.keys():
                return [hashtable.get(target - nums[i]), i]
            hashtable[nums[i]] = i
        return []


# test case
nums = [2, 2, 11, 15]
target = 4
s = Solution1()
print(s.twoSum(nums, target))
