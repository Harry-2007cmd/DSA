class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char ch = keysPressed.charAt(0);

        for (int i = 1; i < keysPressed.length(); i++) {
            int time = releaseTimes[i] - releaseTimes[i - 1];
            char ch1 = keysPressed.charAt(i);

            if (time > max || (time == max && ch1 > ch)) {
                max = time;
                ch = ch1;
            }
        }
        return ch;
    }
}
