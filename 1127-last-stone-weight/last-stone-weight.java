
class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> ques =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            ques.offer(stone);
        }

        while (ques.size() > 1) {
            int y = ques.poll();
            int x = ques.poll();

            if (x != y) {
                ques.offer(y - x);
            }
        }

        return ques.isEmpty() ? 0 : ques.poll();
    }
}
