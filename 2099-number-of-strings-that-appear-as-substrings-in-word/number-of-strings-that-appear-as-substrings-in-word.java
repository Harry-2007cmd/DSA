class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String words:patterns){
            if(word.indexOf(words)!=-1){
                count++;
            }
        }
        return count;
    }
}