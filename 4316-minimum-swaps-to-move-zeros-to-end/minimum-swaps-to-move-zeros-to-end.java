class Solution {
    public int minimumSwaps(int[] nums) {
        int right = nums.length-1;
        int count=0;
        int zero = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
        }

        for(int i = 0;i<nums.length-zero;i++){
            if(nums[i]==0){
             count++;
             int temp = nums[i];
             nums[i] = nums[right];
             nums[right] = temp;
             right--;
            }
        }
        return count;
    }
}