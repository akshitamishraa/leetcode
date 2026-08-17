class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        while (i >= 0 ) {
         if (s.charAt(i) == ' ') {
            i--;
        } else {
            break;
        }
        }
        while (i >= 0 ){
        if(s.charAt(i) == ' ') {
            break;
        }else{
            count++;
            i--;
        }
        }
        return count;
    }
}