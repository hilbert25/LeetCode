class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        l=len(nums1)+len(nums2)
        if l%2==1:
            return self.deal(nums1,nums2,int((l+1)/2))
        else:
            return (self.deal(nums1,nums2,l/2)+self.deal(nums1,nums2,l/2+1))* 0.5

    def deal(self,nums1,nums2,k):
        la=len(nums1)
        lb=len(nums2)
        if la>lb:
            return self.deal(nums2,nums1,k)
        if la==0:
            return nums2[k-1]
        if k==1:
            return min(nums1[0],nums2[0])
        index1=int(min(la,k/2))
        index2=int(k-index1)
        if(nums1[index1-1]<=nums2[index2-1]):
            return self.deal(nums1[index1:],nums2,index2)
        else:
            return self.deal(nums1,nums2[index2:],index1)