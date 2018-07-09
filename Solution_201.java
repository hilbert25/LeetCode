public class Solution_201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param m
	 * @param n
	 * @return
	 */
	public int rangeBitwiseAnd(int m, int n) {
		int i = 0;
		while (m != n) {
			m >>= 1;
			n >>= 1;
			i++;
		}
		return m << i;
	}
}
