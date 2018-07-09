package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_40 {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		List<Integer> current = new ArrayList<Integer>();
		dfs(candidates, 0, list, current, 0, target);
		return list;
	}

	public void dfs(int[] candidates, int begin, List<List<Integer>> list,
			List<Integer> current, int sum, int target) {
		if (sum == target) {
			List<Integer> temp = new ArrayList<Integer>(current.size());
			temp.addAll(current);
			list.add(temp);
			return;
		} else {
			int l = candidates.length;
			for (int i = begin; i < l && sum + candidates[i] <= target; i++) {
				sum = sum + candidates[i];
				current.add(candidates[i]);
				dfs(candidates, i + 1, list, current, sum, target);
				sum = sum - current.get(current.size() - 1);
				current.remove(current.size() - 1);
				int j = i;
				while (j < l && candidates[j] == candidates[i])
					j++;
				i = j - 1;
			}
		}
	}
}