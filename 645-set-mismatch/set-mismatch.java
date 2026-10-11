class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        int i =0;
        while(i<nums.length){
            int curr = nums[i]-1;
            if(nums[i] != nums[curr]){
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{};
    }
}