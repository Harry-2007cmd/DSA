class Solution {
    public String removeStars(String s) {
     Stack<Character> st = new Stack<>();

     for(char ch : s.toCharArray()){
        if(st.empty()){
            st.push(ch);
        }else if(ch == '*'){
            st.pop();
        }else{
            st.push(ch);
        }
     }

       StringBuilder ans = new StringBuilder();
       while(!st.empty()){
        ans.append(st.pop());
       }
       return ans.reverse().toString();
    }
}