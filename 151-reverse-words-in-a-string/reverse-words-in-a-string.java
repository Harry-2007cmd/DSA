class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String arr[] = str.split("\\s+");
        int size = arr.length;
        String ans[] = new String[size];
        int x =size-1;
        for(int i =0;i<size;i++){
           ans[x] = arr[i];
           x--;
        }
        
        return String.join(" " , ans);

    }
}