class Solution {
    public int compress(char[] chars) {
       int write=0;
       int read =0;
        while(read<chars.length){
            int count  =0;
            char current = chars[read];
            while( read<chars.length && chars[read]== current){
                read++;
                count++;
            }
            chars[write++] = current;
            if(count>1){
                String count1 = String.valueOf(count);
                for(char a : count1.toCharArray()){
                    chars[write++] = a;
                }
            }
        }
        return write;

    }
}