class Solution(object):
    def removeDuplicates(self, nums):
      a=0
      b=1
      l=len(nums)
      if l<=1:
        return l
      else:
        for b in range(1,l):
          if nums[b] != nums[b-1]:
            a+=1
            nums[a]=nums[b]
        return a+1