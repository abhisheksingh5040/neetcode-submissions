class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0;i < n;i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                int index = map.get(num);
                return new int[]{index , i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{-1,-1};
    }
}
