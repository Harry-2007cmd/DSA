import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {

        PriorityQueue<Long> ques = new PriorityQueue<>();
        ques.offer(1L);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans = ques.poll();

            if (!ques.contains(ans * 2)) ques.offer(ans * 2);
            if (!ques.contains(ans * 3)) ques.offer(ans * 3);
            if (!ques.contains(ans * 5)) ques.offer(ans * 5);
        }

        return (int) ans;
    }
}