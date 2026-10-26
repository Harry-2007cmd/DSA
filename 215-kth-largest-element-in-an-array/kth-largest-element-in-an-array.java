class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> ques = new PriorityQueue<>();

        for (int j = 0; j < k; j++) {
            ques.add(nums[j]);
        }

        for (int j = k; j < nums.length; j++) {
            if (ques.peek() < nums[j]) {
                ques.poll();
                ques.add(nums[j]);
            }
        }

        return ques.peek();
    }
}
