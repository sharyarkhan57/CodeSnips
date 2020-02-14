class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        if nums is null:
            return []
        if len(nums) <= k:
            return [max(nums)]
        
        i = 0, j = k
        sol = [] 
        while j < len(nums) - 1:
            sol.append(max(nums[i:j]))
            i++
            j++
        
        return sol
        
