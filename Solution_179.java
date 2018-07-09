import java.util.Arrays;
import java.util.Comparator;

public class Solution_179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String largestNumber(int[] nums) {
		Integer[] temp = new Integer[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
		}
		Arrays.sort(temp, new NumsComperator());
		if (temp[0] == 0)
			return "0";
		String res = "";
		for (int i = 0; i < temp.length; i++) {
			res += String.valueOf(temp[i]);
		}
		return res;
	}

	class NumsComperator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			long a = Long.valueOf(String.valueOf(o1) + String.valueOf(o2));
			long b = Long.valueOf(String.valueOf(o2) + String.valueOf(o1));
			if (a > b) {
				return 1;
			} else if (a < b) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
