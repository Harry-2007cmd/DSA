class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count =0;
        for(int i =0;i<words.length;i++){
            String current = words[i];
            for(int j =i;j<words.length;j++){
                String str = new StringBuilder(words[j]).reverse().toString();
                if(str.equals(current) && i!=j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}