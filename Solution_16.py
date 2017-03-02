import sys
class Solution(object):
   def threeSumClosest(self, nums, target):
        nums=sorted(nums)
        l=len(nums)-1
        dValue=sys.maxsize
        result=0
        for i in range(0,l):
            j,k=i+1,l
            while j<k:
                sum=nums[i]+nums[j]+nums[k]
                if sum<target:
                    if abs(sum-target)<dValue:
                        dValue=abs(sum-target)
                        result=sum
                    j+=1
                elif sum>target:
                    if abs(sum-target)<dValue:
                        dValue=abs(sum-target)
                        result=sum
                    k-=1
                else:
                    return sum               
        return result