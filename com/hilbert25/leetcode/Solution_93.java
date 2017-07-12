package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月22日 下午10:48:24 LeetCode com.hilbert25.leetcode
 *          Solution_93
 */
public class Solution_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		restoreIpAddresses("0000");
	}

	public static List<String> restoreIpAddresses(String s) {
		List<String> res = new ArrayList<String>();
		if (s.length() > 12||s.length()<4)
			return res;
		visit(s, res, "", 0, 0);
		return res;
	}

	public static void visit(String s, List<String> res, String tempIp, int pos, int seq) {
		if (seq == 4) {
			res.add(tempIp.substring(0, tempIp.length() - 1));
			return;
		}
		for (int i = 1; i <= 3; i++) {
			if (pos + i > s.length())
				break;
			if (seq == 3 && pos + i != s.length())
				continue;
			String t = s.substring(pos, pos + i);
			if ((i > 1 && t.charAt(0) == '0') || Integer.valueOf(t) > 255)
				break;
			else {
				tempIp += t + ".";
				pos += i;
				seq++;
				visit(s, res, tempIp, pos, seq);
				tempIp = tempIp.substring(0, tempIp.length() - 1 - i);
				pos -= i;
				seq--;
			}
		}
		return;
	}
}
