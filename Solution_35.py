class Solution(object):
    def searchInsert(self, nums, target):
      low=0
      high=len(nums)-1
      middle=0
      while low<=high:
        middle=(low+high)/2
        if nums[middle]<target:
          low=middle+1
        elif nums[middle]>target:
          high=middle-1
        else:
           break
      if nums[middle]==target:
        return middle
      else:
        if nums[middle]<target:
          return middle+1
        else:
          if middle==0:
            return 0
          else:
            return middle
        