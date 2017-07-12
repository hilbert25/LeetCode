public class Solution_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords(" "));
	}

	public static String reverseWords(String s) {
		String res = "";
		int end = s.length() - 1;
		int start = end;
		while (end >= 0) {
			while (end >= 0 && s.charAt(end) == ' ') {
				end--;
			}
			start = end;
			while (start >= 0 && s.charAt(start) != ' ') {
				start--;
			}
			res += s.substring(start + 1, end + 1) + " ";
			end = start;
		}
		if (res.length() > 1)
			return res.substring(0, res.length() - 2);
		else
			return res;
	}
}
