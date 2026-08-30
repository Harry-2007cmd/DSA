class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        int left = maxIndex + 1;

        int right = n - minIndex;

        int both = (minIndex + 1) + (n - maxIndex);

        return Math.min( right, Math.min(left, both));
    }
}
