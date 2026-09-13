class Solution {
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {

                // left character delete
                if (check(s, i + 1, j)) {
                    return true;
                }

                // right character delete
                if (check(s, i, j - 1)) {
                    return true;
                }

                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean check(String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}