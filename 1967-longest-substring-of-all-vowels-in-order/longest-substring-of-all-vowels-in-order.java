class Solution {
    public int longestBeautifulSubstring(String word) {

        int length = 1;
        int vowels = 1;
        int max = 0;

        for (int i = 1; i < word.length(); i++) {

            if (word.charAt(i) >= word.charAt(i - 1)) {
                length++;

                if (word.charAt(i) > word.charAt(i - 1)) {
                    vowels++;
                }

                if (vowels == 5) {
                    max = Math.max(max, length);
                }

            } else {
                length = 1;
                vowels = 1;
            }
        }

        return max;
    }
}