class Solution {
    public String reverseWords(String s) {
        // "   hello,   world   "
        String trim = s.trim();
        // = "hello    word"

        String[] arr = trim.split("\\s+");
        // = "hello world"

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        //arr - > [world hello]
        return String.join(" ", arr);  //"wold hello"
    }
}