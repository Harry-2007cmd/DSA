class Solution {
    public int totalWaviness(int num1, int num2) {
        int answer = 0;
        if(num1<=99){
            num1 = 100;
        }
        while(num1<=num2){
            answer+=findWaves(num1);
            num1++;
        }
        return answer;

    }
            int findWaves(int n){
            int  ans = 0;
            ArrayList<Integer> nums = new ArrayList<>();
            while(n>0){
                nums.add(n%10);
                n/=10;
            }
            for(int i = 1;i<nums.size()-1;i++){
                if(nums.get(i)>nums.get(i+1) && nums.get(i)>nums.get(i-1)){
                    ans++;
                    continue;
                }
                if(nums.get(i)<nums.get(i+1) && nums.get(i)<nums.get(i-1)){
                    ans++;
                    continue;
                }
             
            }
            return ans;
        }
}