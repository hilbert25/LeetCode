public class Solution_42 {
   public static int trap(int[] height) {
        if(height.length<=2)
			return 0;
		int water = 0;
		int leftMax = height[0], rightMax = height[height.length - 1];
		int max[][] = new int[2][height.length];
		max[0][0] = 0;
		max[1][height.length - 1] = 0;
		for (int i = 1; i < height.length; i++) {
			max[0][i] = leftMax;
			if (height[i] > leftMax)
				leftMax = height[i];
		}
		for (int i = height.length - 2; i >= 0; i--) {
			max[1][i] = rightMax;
			if (height[i] > rightMax)
				rightMax = height[i];
		}
		for (int i = 0; i < height.length; i++) {
			int min = Math.min(max[0][i], max[1][i]);
			if (min > height[i])
				water += min - height[i];
		}
		return water;
	}
}