class Solution(object):
    def peakIndexInMountainArray(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        left, right = 0, len(A)-1
        while left < len(A)-1 and A[left] +1 > A[left]:
        	left += 1
        while right > 0 and A[right-1] > A[right]:
        	right -= 1
        return left == right