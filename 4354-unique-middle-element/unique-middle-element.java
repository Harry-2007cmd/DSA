class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle = nums[nums.length/2];
        for(int i =0;i<nums.length;i++){
            if(nums[i] == middle && i != nums.length/2) return false;
        }
        return true;
    }
}