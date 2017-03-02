public class Solution_39 {  
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		dfs(candidates, target, 0, 0, result, current);
		return result;
	}

	public void dfs(int[] candidates, int target, int begin, int sum,
			List<List<Integer>> result, List<Integer> current) {
		int len = candidates.length;
		for (int i = begin; i < len && sum + candidates[i] <= target; i++) {
			if (sum + candidates[i] < target) {
				sum += candidates[i];
				current.add(candidates[i]);
				dfs(candidates, target, i, sum, result, current);// 這裏錯了
				sum = sum - current.get(current.size() - 1);
				current.remove(current.size() - 1);
			} else {
				current.add(candidates[i]);
				List<Integer> list = new ArrayList<Integer>(current.size());
				list.addAll(current);
				result.add(list);
				sum = sum - current.get(current.size() - 1);
				current.remove(current.size() - 1);
				return;
			}
		}
		return;
	}
}  