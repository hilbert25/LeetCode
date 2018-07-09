class Solution(object):
    def flipAndInvertImage(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        for i in range(0,len(A)):
        	A[i] = A[i][::-1]
        	A[i] = [ 1^ A[i][j] for j in range(len(A))]
        return A
