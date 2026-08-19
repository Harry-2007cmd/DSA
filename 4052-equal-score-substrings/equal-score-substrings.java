class Solution {
    public boolean scoreBalance(String s) {
        for(int i =0;i<s.length();i++){
            String str1 = s.substring(0,i+1);
            String str2 = s.substring(i+1);
            int sum1 =0;
            int sum2=0;
            for(int j =0;j<str1.length();j++){
                sum1+=str1.charAt(j)-'a'+1;
            }
            for(int j =0;j<str2.length();j++){
                sum2+=str2.charAt(j)-'a'+1;
            }

            if(sum1 == sum2) return true;

        }
        return false;
    }
}