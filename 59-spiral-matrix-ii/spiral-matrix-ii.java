class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n-1;
        int up = 0;
        int down = n-1;
        int j=1;
        int answer[][] = new int[n][n];
        while(left<=right && up<=down){
            
            for(int i = left ;i<=right;i++){
               answer[up][i]=j++;
            }
            up++;
            for(int i = up;i<=down;i++){
                answer[i][right]=j++;
            }
            right--;

            if(up<=down){
                for(int i =right;i>=left;i--){
                     answer[down][i]= j++;
                }
                down--;
            }

            if(left<=right){
                for(int i =down;i>=up;i--){
                     answer[i][left]= j++;
                }
                left++;
            }
            
        }
        return answer;
    }
}