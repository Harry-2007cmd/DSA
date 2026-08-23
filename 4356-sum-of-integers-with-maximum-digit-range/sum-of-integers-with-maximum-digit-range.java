class Solution {
    public int maxDigitRange(int[] nums) {
        int range[] = new int[nums.length];
         int max_range = 0;
        int total = 0;
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(num>0){
                int temp = num%10;
                min = Math.min(min,temp>0?temp:0);
                max = Math.max(max , temp>0?temp:0);
                num/=10;
            }
            range[i] = max - min;
              max_range= Math.max(max_range , max - min);
        }
     
      for(int  i = 0;i<range.length;i++){
        if(range[i] == max_range){
            total+=nums[i];
        }
      } 
   return total;      

    }
}