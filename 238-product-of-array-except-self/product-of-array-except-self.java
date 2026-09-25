class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
       
        int[] suffix = new int[n];
        int[] preffix = new int[n];
        preffix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i =1;i<n;i++){
            preffix[i] = preffix[i-1] * nums[i];
        }
        for(int i =n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i];
        }

        for(int i = 0; i < n; i++){
            if(i == 0){
                ans[i] = suffix[i+1];
            } else if(i == n-1){
                ans[i] = preffix[i-1];
            } else {
                ans[i] = preffix[i-1] * suffix[i+1];
            }
        }

return ans;
    }
}