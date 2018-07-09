import java.util.HashSet;
import java.util.Set;

/**
 * @author hht
 * 
 */
public class Solution_202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param n
	 * @return
	 */
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			int temp = 0;
			while (n > 0) {
				int newNumber = n % 10;
				temp += newNumber * newNumber;
				n = n / 10;
			}
			n = temp;
		}
		return n == 1;
	}
}
