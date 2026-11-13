class Solution {
    public boolean divideArray(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}