class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int i =0;
        while(i<n){
            for(int j =0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            i++;
        }

    }
}