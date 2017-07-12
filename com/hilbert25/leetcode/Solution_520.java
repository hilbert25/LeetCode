public class Solution_520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * DFA
	 * 
	 * @param word
	 * @return
	 */
	public boolean detectCapitalUse(String word) {
		int[][] matrix = { { 1, 3, 6, 3, 6, 6 }, { 2, 4, 5, 6, 5, 5 } };
		int status = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c >= 'a' && c <= 'z') {
				status = matrix[1][status];
			} else {
				status = matrix[0][status];
			}
			if (status == 6)
				return false;
		}
		return true;
	}
}
