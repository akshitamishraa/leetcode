class Solution {
    public String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++) {

            int left = 0;
            int right = words[i].length() - 1;

            boolean flag = true;

            while(left < right) {
                if(words[i].charAt(left) != words[i].charAt(right)) {
                    flag = false;
                    break;
                }

                left++;
                right--;
            }

            if(flag) {
                return words[i];
            }
        }

        return "";
    }
}