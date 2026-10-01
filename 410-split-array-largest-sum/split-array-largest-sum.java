class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int subarrays = 1;
            int sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {
                    subarrays++;
                    sum = num;
                } else {
                    sum += num;
                }
            }

            if (subarrays <= k) {
                // We can split into k or fewer parts,
                // so try a smaller maximum sum.
                end = mid;
            } else {
                // We need more than k parts,
                // so mid is too small.
                start = mid + 1;
            }
        }

        return start;
    }
}
