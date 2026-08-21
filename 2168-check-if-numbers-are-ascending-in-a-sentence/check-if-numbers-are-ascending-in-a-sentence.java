class Solution {
    public boolean areNumbersAscending(String s) {
        String[] strs = s.split(" ");
        List<Integer> nums = new ArrayList<>();

        for (String str : strs) {
            if (str.matches("\\d+")) {
                nums.add(Integer.parseInt(str));
            }
        }

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}