class Solution {
    public boolean halvesAreAlike(String s) {
        int size = s.length() / 2;
        
        String a = s.substring(0, size);
        String b = s.substring(size);
        
        String vowel = "aeiouAEIOU";
        int v_a = 0;
        int v_b = 0;

        for (int i = 0; i < size; i++) {
            if (vowel.indexOf(a.charAt(i)) != -1) {
                v_a++;
            }
            
            if (vowel.indexOf(b.charAt(i)) != -1) {
                v_b++;
            }
        }

        return v_a == v_b;
    }
}