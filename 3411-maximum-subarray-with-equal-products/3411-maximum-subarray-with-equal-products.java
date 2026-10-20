class Solution {
    public int maxLength(int[] nums) {
        int maxLength = 0 ;

        for(int i = 0; i < nums.length; i++){
        
            long prod = 1;
            int gcd = 0; 
            long lcm = 1;
            for(int j = i; j < nums.length; j++){
                int num = nums[j];
                prod = prod * nums[j];
                gcd = findGCD(gcd, num); 
                lcm = (lcm / findGCD((int) lcm, num)) * num;

                if(prod == lcm * gcd){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
    public int findGCD(int a, int b) { 
        while (b != 0) { 
            int temp = b; 
            b = a % b; 
            a = temp; 
        } 
        return a;
    }
}