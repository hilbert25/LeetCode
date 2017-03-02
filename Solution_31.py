class Solution(object):
    def nextPermutation(self, nums):
      l=len(nums)-1
      flag=-1
      for i in range (l,0,-1):
        if nums[i]>nums[i-1]:
          flag=i-1
          break #zai zhe li jin wei 
      if flag!=-1:
        for i in range(l,flag,-1):
         if nums[i]>nums[flag]:
            nums[i],nums[flag]=nums[flag],nums[i]
            break
      i,j=flag+1,l
      while i<=j:
        nums[i],nums[j],i,j=nums[j],nums[i],i+1,j-1    
