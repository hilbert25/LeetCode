import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
  public static int lengthOfLongestSubstring(String s) {
		int max = 0, begin = 0;
		Map<Object, Integer> map = new HashMap<>();
		int l=s.length();
		for (int i = 0; i < l; i++) {
			char c=s.charAt(i);
			if (!map.containsKey(c) || map.get(c) < begin) {// 没有出现重复的或者上次出现不在区间内
				if (i - begin + 1 > max) {
					max = i - begin + 1;
				}
			} else {
				begin=map.get(c)+1;
			}
			map.put(c, i);
		}
		return max;
	}
}