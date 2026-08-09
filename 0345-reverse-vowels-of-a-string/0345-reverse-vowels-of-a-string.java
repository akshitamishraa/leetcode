class Solution {
    public String reverseVowels(String s) {
      char[] arr = s.toCharArray();

      int i = 0;
      int j = arr.length - 1;

      while(i < j){
        char temp1 = arr[i];
        char temp2 = arr[j];
        if (temp1 != 'A' && temp1 != 'E' && temp1 != 'I' && temp1 != 'O' && temp1 != 'U' && temp1 != 'a' && temp1 != 'e' && temp1 != 'i' && temp1 != 'o' && temp1 != 'u'){
            i++;
        }
        else if(temp2 != 'A' && temp2 != 'E' && temp2 != 'I' && temp2 != 'O' && temp2 != 'U' && temp2 != 'a' && temp2 != 'e' && temp2 != 'i' && temp2 != 'o' && temp2 != 'u'){
            j--;
        }
        else {
            arr[i] = temp2;
            arr[j] = temp1;

            i++;
            j--; 
        }
      }
      return new String(arr);
    }
}