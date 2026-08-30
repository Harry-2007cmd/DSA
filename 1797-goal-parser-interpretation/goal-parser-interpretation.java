class Solution {
    public String interpret(String command) {
        int size = command.length();
        char[] arr = command.toCharArray();
        String str = new String();
        for(int i = 0;i<size;i++){
            if(arr[i] == '(' && arr[i+1] == ')') str = str+'o';
            if(Character.isLetter(arr[i])) str = str+arr[i];
        }
        return str;
    }
}