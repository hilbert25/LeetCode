/**
 * 
 */
/** 
 * @author 作者 : hht
 * @version 创建时间：2017年7月10日 上午11:38:43 
 * 类说明 
 */
/**
 * @author hht
 * 
 */
public class Solution_209 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param s
	 * @param nums
	 * @return
	 */
	public int minSubArrayLen(int s, int[] nums) {
		int result = nums.length + 1;
		int start, end, sum;
		start = end = sum = 0;
		int i = 0;
		while (i < nums.length) {
			sum += nums[i];
			if (sum >= s) {
				end = i--;
				result = Math.min(result, end - start + 1);
				sum -= nums[start++]; 
				sum -= nums[end];
			}
			i++;
		}
		if (result > nums.length)
			return 0;
		return result;
	}
}
