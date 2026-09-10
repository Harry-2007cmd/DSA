class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int answer[][] = new int[m][n];
        for(int[] indice : indices){
            int r = indice[0];
            int c = indice[1];

           for(int i =0;i<n;i++){
              answer[r][i]++;
           }

           for(int i =0;i<m;i++){
               answer[i][c]++;
           }

        }
       int  count  =0;
        for(int  i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(answer[i][j]%2!=0) count++;
            }
        }

        return count;
        
    }
}