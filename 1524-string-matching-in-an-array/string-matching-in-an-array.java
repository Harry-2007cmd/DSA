class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        
        for(int i =0;i<words.length;i++){
            String current = words[i];
            for(int j =0;j<words.length;j++){
                if(!res.contains(words[j]) && current.indexOf(words[j])!=-1 && !current.equals(words[j])) {
                    res.add(words[j]);
                }
            }
        }
      return res;
    }
}