import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 */
/** 
 * @author 作者 : hht
 * @version 创建时间：2017年7月3日 下午9:41:42 
 * 类说明 
 */
/**
 * @author hht
 * 
 */
public class Solution_127 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param beginWord
	 * @param endWord
	 * @param wordList
	 * @return
	 */
	public int ladderLength(String beginWord, String endWord,
			List<String> wordList) {
		if (!wordList.contains(endWord))
			return 0;
		boolean[][] neighbour = new boolean[wordList.size()][wordList.size()];
		boolean[] visited = new boolean[wordList.size()];
		for (int i = 0; i < wordList.size(); i++) {
			for (int j = i + 1; j < wordList.size(); j++) {
				neighbour[i][j] = isNeigh(wordList.get(i), wordList.get(j));
				neighbour[j][i] = neighbour[i][j];
			}
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		int level = 1;
		for (int i = 0; i < wordList.size(); i++) {
			if (isNeigh(beginWord, wordList.get(i))) {
				if (wordList.get(i).equals(endWord))
					return 2;
				visited[i] = true;
				queue.add(i);
			}
		}
		while (!queue.isEmpty()) {
			int count = queue.size();
			level++;
			for (int i = 0; i < count; i++) {
				int t = queue.poll();
				if (wordList.get(t).equals(endWord)) {
					return level;
				}
				for (int j = 0; j < wordList.size(); j++) {
					if (neighbour[t][j] && !visited[j]) {
						queue.add(j);
					}
				}
			}
		}
		return level;
	}

	/**
	 * @param str1
	 * @param str2
	 * @return
	 */
	public boolean isNeigh(String str1, String str2) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				count++;
			}
		}
		return count == 1;
	}
}
