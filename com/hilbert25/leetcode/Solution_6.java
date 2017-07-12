package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月27日 下午7:02:35 LeetCode com.hilbert25.leetcode Solution_6
 */
public class Solution_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("abcdefg", 4));
	}

	/**
	 * @param s
	 * @param numRows
	 * @return
	 */
	public static String convert(String s, int numRows) {
		if(numRows==1||numRows==0)
			return s;
		char[] cArr = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		int max = (numRows - 1) * 2;
		for (int i = 0; i < numRows; i++) {
			int[] step = { max - i * 2, i * 2 };
			int index = 0;
			int j = i;
			while (j < cArr.length) {
				if (step[index%2] != 0)
					sb.append(String.valueOf(cArr[j]));
				j += step[index % 2];
				index++;
			}
		}
		return sb.toString();
	}
}
