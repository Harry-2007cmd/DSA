class Solution {
    public int findDuplicate(int[] nums) {
         
         int i = 0;
         while(i<nums.length){
            int curr = nums[i]-1;
            if(nums[i]!=nums[curr]){
                swap(nums , i , curr);
            }else{
                i++;
            }
         }
       
       for(int j = 0;j<nums.length;j++){
        if(nums[j] != j+1){
            return nums[j];
        }
       }
      return nums.length;
    }

    void swap(int[] arr , int first , int second){
    int temp  = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
   }
}