class Solution(object):
    def searchRange(self, nums, target):
      left,right,middle=-1,-1,self.binarySearch(nums,target)
      i,j,l=0,middle,len(nums)-1
      if middle ==-1:
        return left,right
      while i<=j:
        m=(i+j)/2
        if nums[m]<target:
          if nums[m+1]==target:
            left=m+1
            break
          else:
            i=m+1
        elif nums[m]==target:
          if m==0 or nums[m-1]<target:
            left=m
            break
          elif nums[m-1]==target:
            j=m-1
      i,j=middle,l
      while i<=j:
        m=(i+j)/2
        if nums[m]>target:
          if nums[m-1]==target:
            right=m-1
            break
          elif nums[m-1]>target:
            j=m-1
        elif nums[m]==target:
          if m==l:
            right=l
            break
          elif nums[m+1]==target:
            i=m+1
          elif nums[m+1]>target:
            right=m
            break
      return left,right

    
    def binarySearch(self,nums,target):
      low=0
      high=len(nums)-1
      while low<=high:
        middle=(low+high)/2
        if nums[middle]<target:
          low=middle+1
        elif nums[middle]>target:
          high=middle-1
        else:
           return middle
      return -1