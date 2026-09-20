class Solution {
    public boolean numberHasEvenDigits(int num){
        int digitsCount = 0;

        while(num != 0){
            num = num / 10;
            digitsCount++;
        }
        return digitsCount % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(numberHasEvenDigits(nums[i])){
                evenCount++;
            }
        }
        return evenCount;    
    }
}