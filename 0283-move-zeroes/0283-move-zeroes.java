class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;

        while(i < nums.length){
            if(nums[i] == 0){
                res.add(nums[i]);
                i++;
            } else if(nums[i] != 0) {
                temp.add(nums[i]);
                i++;
            } 
        }
        temp.addAll(res);

        for(int j = 0; j < nums.length; j++) {
            nums[j] = temp.get(j);
        }
    }
}