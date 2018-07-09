package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月16日 上午12:38:57 LeetCode com.hilbert25.leetcode
 *          Solution_126
 */
public class Solution_126 {
	public static void main(String[] args) {

	}

	public static int minLongest = Integer.MAX_VALUE;

	/**
	 * dfs or backtracking will be ttl,so choose bfs
	 * 
	 * @param beginWord
	 * @param endWord
	 * @param wordList
	 * @return
	 */
	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> curList = new ArrayList<String>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		if (!wordList.contains(beginWord)) {
			wordList.add(beginWord);
		}
		if (!wordList.contains(endWord)) {
			wordList.add(endWord);
		}
		boolean[] visited = new boolean[wordList.size()];
		visited[wordList.indexOf(beginWord)] = true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(wordList.indexOf(beginWord));
		List<String> list = new ArrayList<>();
		list.add(beginWord);
		map.put(beginWord, list);
		while (!queue.isEmpty()) {
			int count = queue.size();
			for (int i = 0; i < count; i++) {
				int t = queue.poll();
				for (int j = 0; j < count; j++) {
					if (!visited[t] && isNeighbour(wordList.get(i), wordList.get(j))) {
						queue.offer(j);
						List<String> tempList = new ArrayList<String>(map.get(wordList.get(t)));
						tempList.add(wordList.get(j));
						map.put(wordList.get(j), tempList);
						visited[j] = true;
					}
				}
			}
		}
		return res;
	}

	/**
	 * @param word1
	 * @param word2
	 * @return
	 */
	public boolean isNeighbour(String word1, String word2) {
		int count = 0;
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) != word2.charAt(i)) {
				count++;
			}
		}
		return count == 1;
	}
}
