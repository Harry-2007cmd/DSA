class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder(s);

        for(int i =0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                 int num = s.charAt(i)-'0';
                 char ch = (char)(s.charAt(i-1)+num);
                 str.setCharAt(i , ch);
            }
        }
        return str.toString();
    }
}