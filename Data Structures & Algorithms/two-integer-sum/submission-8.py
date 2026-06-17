class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        pMap = {}

        for i , v in enumerate(nums):
            tar = target - v
            if tar in pMap:
                return [pMap[tar] , i]
            pMap[v] = i
        return[0,0]