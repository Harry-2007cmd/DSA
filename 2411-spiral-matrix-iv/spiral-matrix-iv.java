/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int ans[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                ans[i][j]=-1;
            }
        }


        int left = 0;
        int right = n-1;
        int up = 0;
        int down = m-1;
        while(left<=right && up <=down){
            
            for(int i =left ;i<=right;i++){
                if(head == null ) return  ans ;
                ans[up][i] = head.val;
                head = head.next;
            }
            up++;
            for(int i = up ;i<=down;i++){
                if(head == null ) return ans ;
                ans[i][right] = head.val;
                head = head.next;
            }

            right--;

            if(up<=down){
                for(int i = right;i>=left;i--){
                    if(head == null ) return ans;
                    ans[down][i] = head.val;
                    head = head.next;

                }
                down--;
            }
            if(left<=right){
                for(int i = down;i>=up;i--){
                    if(head == null ) return ans;
                    ans[i][left] = head.val;
                    head = head.next;

                }
                left ++;
            }
        }

      return ans;
        
    }
}