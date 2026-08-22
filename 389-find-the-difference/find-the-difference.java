class Solution {
    public char findTheDifference(String s, String t) {
        int size_t = t.length();
        int size_s = s.length();
        if(s.length()<1) {return t.charAt(0);}

        int[] freq = new int[26];

        for(int i =0;i<size_t;i++){
            int num = t.charAt(i)-'a';
            freq[num]++;
        }
        for(int i =0;i<size_s;i++){
            int num = s.charAt(i)-'a';
            freq[num]--;
        }
      
        int index = 0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
               return (char) ('a'+i);
            }
        }
         return '\0';
    }
}