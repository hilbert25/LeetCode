class Solution(object):
    def removeElement(self, nums, val):
        count = 0
        n = len(nums)
        for i in range(n):
            i -= count
            if nums[i] == val:
                nums.pop(i)
                count += 1
                
        return n - count