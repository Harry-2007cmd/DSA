class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> strs = new ArrayList<>();
         String[] words = text.split(" ");
        for(int i =0;i+2<words.length;i++){
            if(words[i].equals(first) && words[i+1].equals(second)){
             strs.add(words[i+2]);
            }
        }
        return strs.toArray(new String[0]);
    }
}