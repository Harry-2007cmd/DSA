class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        boolean result = str.equals(reverse) ? true : false;
        return result;
    }
}