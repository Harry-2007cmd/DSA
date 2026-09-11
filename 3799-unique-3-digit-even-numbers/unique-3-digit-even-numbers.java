class Solution {
    public int totalNumbers(int[] digits) {
       int count =0;
        int[] freq = new int[10];
        for(int num : digits){
            freq[num]++;
        }

        for(int i =100;i<=998;i+=2){

            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;
            
            int need[] = new int[10];
            need[a]++;
            need[b]++;
            need[c]++;

            boolean possible = true;

            for(int  j =0;j<10;j++){
                if(need[j]>freq[j]){
                    possible = false;
                    break;
                }
            }

            if(possible){
                count++;
            }

        }

        return count;
        
    }
}