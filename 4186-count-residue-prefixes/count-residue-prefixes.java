class Solution {
    public int residuePrefixes(String s) {
        int count = 0;
        int distinct = 0;
        HashSet<Character> dist = new HashSet<>();
        for(int i =0;i<s.length();i++){
            if(!dist.contains(s.charAt(i))){
                distinct++;
                dist.add(s.charAt(i));
            }
            String str = s.substring(0,i+1);
            if(str.length()%3==distinct){
                 count++;
            }
           
        }
        return count;
    }
}