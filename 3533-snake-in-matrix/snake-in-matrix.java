class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
          int  i =0;
          int j =0;

        for(String str : commands){
            switch(str){
                 case "RIGHT":
                     j++;
                     break;
                case "LEFT":
                    j--;
                    break;
                case "DOWN":
                   i++;
                   break;
                case "UP":
                  i--;
                  break;
                default:
                     System.out.print("Invalid");
            }
        }
        
        return (i*n)+j;
    }
}