class Solution {
    public int vowelConsonantScore(String s) {
     List<Character> list = List.of('a','e','i','o','u');   
     int consonant =0;
     int vowel = 0;
     for(char ch: s.toCharArray()){
        if(list.contains(ch)){
            vowel++;
        }else if(!Character.isDigit(ch) && ch !=' '){
            consonant++;
        }
     }
      if(consonant ==0 || vowel ==0) return 0;  
        return (int)Math.floor(vowel/consonant);
    }
}