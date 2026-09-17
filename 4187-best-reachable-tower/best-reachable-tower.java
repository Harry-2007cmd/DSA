class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {

        int[] ans = {-1, -1};
        int max = Integer.MIN_VALUE;

        for (int[] arr : towers) {

            int dist = Math.abs(center[0] - arr[0])
                     + Math.abs(center[1] - arr[1]);

            if (dist <= radius) {

                if (arr[2] > max) {
                    max = arr[2];
                    ans[0] = arr[0];
                    ans[1] = arr[1];
                }

                else if (arr[2] == max) {
                    if (arr[0] < ans[0] ||
                       (arr[0] == ans[0] && arr[1] < ans[1])) {
                        ans[0] = arr[0];
                        ans[1] = arr[1];
                    }
                }
            }
        }

        return ans;
    }
}
