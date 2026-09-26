class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String , String> map = new HashMap<>();

        for(List<String> arr  : knowledge){
            map.put(arr.get(0) , arr.get(1));
        } 

        StringBuilder ans = new StringBuilder();

        for(int i =0 ;i<s.length();i++){

          if(s.charAt(i) == '('){
            
            int j = i+1;

            while(s.charAt(j) !=')'){
                j++;
            }

            String str = s.substring(i+1, j);

            ans.append(map.getOrDefault(str , "?"));

            i =j;


          }else{
            ans.append(s.charAt(i));
          }

        }
        return ans.toString();        
    }
}