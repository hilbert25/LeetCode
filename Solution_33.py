class Solution(object):
    def search(self, nums, target):
    	return self.binarySearch(nums,0,len(nums)-1,target)
    def binarySearch(self,nums,left,right,target):
    	if(left>right):
    		return -1
    	middle=(left+right)/2
    	if nums[middle]==target:
    		return middle
    	else:
    		if nums[middle]>=nums[left]:
    			if nums[left]<=target and target<=nums[middle]:
    				return self.binarySearch(nums,left,middle-1,target)
    			else:
    				return self.binarySearch(nums,middle+1,right,target)
    		else:
    			if nums[middle]<=target and target<=nums[right]:
    				return self.binarySearch(nums,middle+1,right,target)
    			else:
    				return self.binarySearch(nums,left,middle-1,target)

        