/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int peak = findPeak(mountainArr);
       int first = Binary_search(mountainArr , 0 , peak , target, true);
     
      if(first !=-1){
       return first;
      }
       return Binary_search(mountainArr , peak , mountainArr.length()-1 , target , false); 

    }


    
    int findPeak(MountainArray arr){
        int start = 0;
        int end = arr.length() -1;
        while(start <end ){
            int mid = start + (end - start)/2;

            if(arr.get(mid)>arr.get(mid+1)){
                end  = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    int Binary_search(MountainArray arr , int start , int end , int target , boolean asc ){
          
                 
        while(start<=end){
               
            int mid = start + (end - start)/2;
             int val = arr.get(mid);
            if(arr.get(mid)==target){
                return mid;
            }

            if(asc){
                if(val > target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(val < target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }

        }
        return -1;

    }
}