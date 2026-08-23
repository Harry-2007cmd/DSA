class Solution {
    public int elevatorRequests(int n, int[] requests) {

        int current =0;
        int total =0;
        for(int i =0 ;i<requests.length;i++){
            if(requests[i]==current) continue;        
            total += Math.abs(requests[i] - current);
            current = requests[i];
        }
        return total;
    }
}