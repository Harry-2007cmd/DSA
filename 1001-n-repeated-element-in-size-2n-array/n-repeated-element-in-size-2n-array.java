class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<>();
        int n = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            if (!table.containsKey(nums[i])) {
                table.put(nums[i], 1);
            } else {
                table.put(nums[i], table.get(nums[i]) + 1);
            }
        }

        for (int key : table.keySet()) {
            if (table.get(key) == n) {
                return key;
            }
        }

        return -1;
    }
}