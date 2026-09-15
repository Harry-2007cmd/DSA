class Solution {
    public int maxDistinct(String s) {
        int count =0;
        Map<Character , Boolean> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.get(ch)==null){
                count++;
                map.put(ch , true);
        }
        }
        return count;
    }
}