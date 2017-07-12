import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
/** 
 * @author 作者 : hht
 * @version 创建时间：2017年7月10日 上午11:22:39 
 * 类说明 
 */
/**
 * @author hht
 * 
 */
public class Solution_217 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		return false;
	}
}
