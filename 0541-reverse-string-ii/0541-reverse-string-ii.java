class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        int start = 0;

        while (start < arr.length) {

            int i = start;
            int j = Math.min(start + k - 1, arr.length - 1);

            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            start += 2 * k;
        }

        return new String(arr);
    }
}