class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        long total = 0;

        for (int num : nums) {
            set.add(num);
            total += num;
        }

        int n = nums.length;

        int x = (int)(total / n) + 1;

        x = Math.max(x, 1);

        while (set.contains(x)) {
            x++;
        }

        return x;
    }
}
