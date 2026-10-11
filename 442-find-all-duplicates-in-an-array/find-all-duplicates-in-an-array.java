class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int i =0;
        while( i<nums.length){
            int curr = nums[i]-1;
            if(nums[i]!=nums[curr]){
                swap(nums , i , curr);
            }else{
                i++;
            }
        }

        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
void swap(int[] arr , int first , int second){
    int temp  = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
   }
}