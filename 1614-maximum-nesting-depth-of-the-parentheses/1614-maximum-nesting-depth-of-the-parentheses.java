class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxdepth = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                depth++;
                maxdepth = Math.max(maxdepth, depth);
            }
            if(s.charAt(i) == ')'){
                depth--;
            }
        }
        return maxdepth;
    }
}