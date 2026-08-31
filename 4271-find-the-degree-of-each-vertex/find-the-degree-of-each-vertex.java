class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] answer = new int[matrix.length];
        int k = 0;
        for(int i =0;i<matrix.length;i++){
            int degree = 0;
            for(int j = 0;j<matrix.length;j++){
                if(matrix[i][j]==1) degree++;
            }
            answer[i] = degree;
        }
        return answer;

    }
}