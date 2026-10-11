class Solution {
    public int missingNumber(int[] nums) {
    
     int  i =0;
     while(i<nums.length){
        int corr = nums[i];
        if(nums[i]==nums.length){
            i++;
            continue;
        }else if(nums[i] != nums[corr]){
            int temp  = nums[i];
            nums[i] = nums[corr];
            nums[corr] = temp;
        }else{
            i++;
        }
     }

    for(int j =0;j<nums.length;j++){
        if(nums[j] != j){
            return j;
        }
    }


return nums.length;
    }

}