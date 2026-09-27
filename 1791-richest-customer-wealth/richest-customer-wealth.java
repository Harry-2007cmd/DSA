class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int[] customer : accounts){

            int sum = sumArray(customer);

            max= Math.max(max , sum);

        }
        return max;
    }

    static int sumArray(int[] arr){
            int sum = 0;

            for(int num : arr){
                sum+=num;
            }
            return sum;
        }
}