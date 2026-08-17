class Solution {
    public int[] scoreValidator(String[] events) {
        int ans[] = new int[2];
        int count = 0;
        int score =0;
        for(int i =0;i<events.length;i++){
            if(ans[1]== 10){
                return ans;
            }
            if(events[i].equals("W")){
                ans[1]++;
                continue;
            }
            if(events[i].equals("WD") || events[i].equals("NB")){
                ans[0]++;
                continue;
            }
            ans[0] += Integer.valueOf(events[i]);
        }

        return ans; 
    }
}