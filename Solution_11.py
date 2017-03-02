class Solution(object):
    def maxArea(self, height):
        x,y=0,len(height)-1
        value=0
        while(x<y):
            temp=min(height[x],height[y])*(y-x)
            value=temp if temp>value else value
            if height[x]<height[y]:
                x+=1
            else:
                y-=1
        return value

        