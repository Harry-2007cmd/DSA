class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

              int left = 0;
              int right = matrix[0].length-1;
              int up = 0;
              int down  = matrix.length-1;
             
 
              while(left<=right && up<=down){
                
                for(int i =left;i<=right;i++){
                    answer.add(matrix[up][i]);
                }
                up+=1;
                for(int i =up;i<=down;i++){
                    answer.add(matrix[i][right]);
                }
                right-=1;
                if(up<=down){
                for(int i = right;i>=left;i--){
                    answer.add(matrix[down][i]);
                }
                down-=1;}
                if(left<=right){
                for(int i = down ;i>=up;i--){
                    answer.add(matrix[i][left]);
                }
                left+=1;}

              }
            return answer;
        
    }
}