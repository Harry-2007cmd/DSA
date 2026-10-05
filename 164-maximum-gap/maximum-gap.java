class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;

        Arrays.sort(nums);

        int Gap = 0;

        for (int i = 1; i < nums.length; i++) {
            Gap = Math.max(Gap, nums[i] - nums[i - 1]);
        }

        return Gap;
    }
}
