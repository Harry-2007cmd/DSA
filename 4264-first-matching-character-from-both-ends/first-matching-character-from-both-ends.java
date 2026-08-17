class Solution {
    public int firstMatchingIndex(String s) {
        char[] str = s.toCharArray();
        int i =0;
        int j = str.length-1;
        if(str.length<2) return 0;
        while(i<=j){
            if(str[i] == str[j]){
                return i;
            }
            i++;
            j--;
        }
        return -1;
    }
}