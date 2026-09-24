class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            if(num>9){
                num = reduce(num);
            }
           if (num==i) return i;
        }
        
        return -1;
    }

    private static int reduce(int num){
        int res= 0;
        while(num>0){
            res +=num%10;
            num = num/10;
        }
        return res;
    }
}