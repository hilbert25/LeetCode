public class Solution_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length && nums[i] + nums[j] <= 0; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				if (search(nums, j + 1, nums.length - 1, -(nums[i] + nums[j])) == -1) {
					continue;
				} else {
					List<Integer> listTemp = new ArrayList<Integer>(3);
					listTemp.add(nums[i]);
					listTemp.add(nums[j]);
					listTemp.add(-(nums[i] + nums[j]));
					list.add(listTemp);
				}
			}
		}
		return list;
    }
    public static int search(int[] nums, int begin, int end, int target) {
		while (begin <= end) {
			int middle = (begin + end) / 2;
			if (nums[middle] < target)
				begin++;
			else if (nums[middle] > target)
				end--;
			else
				return middle;
		}
		return -1;
	}
}