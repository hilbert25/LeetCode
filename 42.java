
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height));
	}

	public static int trap(int[] height) {
		if(height.length<=2)
			return 0;
		int water = 0;
		int leftMax = height[0], rightMax = height[height.length - 1];
		int max[][] = new int[2][height.length];//第一行存储左边最大，第二行存储右边最大。用二者最小值减去height即可
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