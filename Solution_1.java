import java.util.Arrays;

public class Solution_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] r = twoSum(nums, target);
		System.out.println(r[0] + " " + r[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		int a = 0, b = 0;
		int[] result = { -1, -1 };
		int[] tempArr = new int[nums.length];
		System.arraycopy(nums, 0, tempArr, 0, tempArr.length);
		Arrays.sort(tempArr);
		int beg = 0, end = tempArr.length - 1;
		while (beg < end) {
			if (tempArr[beg] + tempArr[end] < target)
				beg++;
			else if (tempArr[beg] + tempArr[end] > target)
				end--;
			else {
				a = tempArr[beg];
				b = tempArr[end];
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == a && result[0] == -1)
				result[0] = i;
			else if (nums[i] == b && result[1] == -1)
				result[1] = i;
		}
		if (result[0] > result[1]) {
			int t = result[0];
			result[0] = result[1];
			result[1] = t;
		}
		return result;
	}
}
