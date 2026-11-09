class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;

        int n = s.length();

        for(int i = 0; i < n/2; i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count1++;
            }
        }

        for(int i = n/2; i < n; i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count2++;
            }
        }

        return count1 == count2;
    }
}