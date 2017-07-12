import java.util.ArrayList;
import java.util.List;

public class Solution_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<>();
		boolean[][] matrix = getMatrix(s);
		search(res, temp, 0, s, matrix);
		return res;
	}

	public void search(List<List<String>> res, List<String> temp, int begin,
			String s, boolean[][] matrix) {
		if (begin == s.length()) {
			res.add(new ArrayList<String>(temp));
			return;
		} else {
			for (int i = begin; i < s.length(); i++) {
				if (matrix[begin][i]) {
					temp.add(s.substring(begin, i + 1));
					search(res, temp, i + 1, s, matrix);
					temp.remove(temp.size() - 1);
				}
			}
			return;
		}

	}

	public static boolean[][] getMatrix(String s) {
		boolean[][] matrix = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			matrix[i][i] = true;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			matrix[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
		}
		for (int i = 2; i < s.length(); i++) {
			for (int j = 0; j < s.length() - i; j++) {
				if (s.charAt(j) == s.charAt(j + i) && matrix[j + 1][j + i - 1]) {
					matrix[j][j + i] = true;
				}
			}
		}
		return matrix;
	}

}
