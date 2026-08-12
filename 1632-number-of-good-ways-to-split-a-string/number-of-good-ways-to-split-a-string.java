class Solution {
    public int numSplits(String s) {
        int[] leftFreq = new int[26];
        int[] rightFreq = new int[26];

        int leftDistinct = 0;
        int rightDistinct = 0;

        for (char c : s.toCharArray()) {
            if (rightFreq[c - 'a'] == 0) {
                rightDistinct++;
            }
            rightFreq[c - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);

            if (leftFreq[c - 'a'] == 0) {
                leftDistinct++;
            }
            leftFreq[c - 'a']++;

            rightFreq[c - 'a']--;

            if (rightFreq[c - 'a'] == 0) {
                rightDistinct--;
            }

            if (leftDistinct == rightDistinct) {
                count++;
            }
        }

        return count;
    }
}