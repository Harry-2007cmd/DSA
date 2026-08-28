class Solution {
    public int secondHighest(String s) {

        HashSet<Integer> nums = new HashSet<>();
        for(int i =0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                 nums.add(s.charAt(i)-'0');
            }
        }
          
        int firstHigh = -1;
        int secondHigh = -1;
        for(int num: nums){
            if(num>firstHigh){
                secondHigh = firstHigh;
                firstHigh = num;
            }else if(num>secondHigh){
                secondHigh = num;
            }
        }

return secondHigh;
        
    }
}