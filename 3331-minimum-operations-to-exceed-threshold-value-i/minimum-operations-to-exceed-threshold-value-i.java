class Solution {
    public int minOperations(int[] nums, int k) {
      int ans = 0;
      for (int num : nums){
        ans +=num<k?1:0;
      }  
      return ans;
    }
}