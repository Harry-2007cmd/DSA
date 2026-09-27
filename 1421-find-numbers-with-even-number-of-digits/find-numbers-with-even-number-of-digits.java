class Solution {
    public int findNumbers(int[] nums) {
        
        int ans = 0 ;

        for(int num : nums){
            ans += evenDigit(num)?1:0;
        }
        return ans;
    }

    private static boolean evenDigit(int num){

        int count = 0;

        while(num>0){
            count++;
            num /=10;
        }

        return count%2==0;
    }
}