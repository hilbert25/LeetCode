public class Solution_137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int singleNumber(int[] nums) {
		int one = 0, two = 0;
		for (int i = 0; i < nums.length; i++) {
			one = (~two) & (one ^ nums[i]);
			two = (~one) & (two ^ nums[i]);
		}
		return one;
	}
}
