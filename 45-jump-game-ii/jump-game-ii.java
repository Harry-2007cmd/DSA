class Solution {
    public int jump(int[] nums) {
                int jump=0;
        int x =0 , j =0;
        for(int i =0;i<nums.length-1;i ++){
            x = Math.max(x , i+nums[i]);
            if(i == j){
                jump++;
                j =x;
            }
            }

        return jump;
    }
}