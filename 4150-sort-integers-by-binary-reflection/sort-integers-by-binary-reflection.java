import java.util.*;

class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr= new Integer[nums.length];
        for(int  i  = 0 ;i<nums.length;i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a,b)->{
            String s1 = Integer.toBinaryString(a);
            String s2 = Integer.toBinaryString(b);

            String r1 = new StringBuilder(s1).reverse().toString();
            String r2 = new StringBuilder(s2).reverse().toString();

            int ref1 = Integer.parseInt(r1, 2);
            int ref2 = Integer.parseInt(r2, 2);

            if(ref1!=ref2){
                return Integer.compare(ref1,ref2);
            }
            return Integer.compare(a,b);
        });

        int ans[] = new int[nums.length];
        for(int i = 0 ; i<nums.length;i++){
            ans[i] = arr[i];
        }
        return ans;
    }
}
