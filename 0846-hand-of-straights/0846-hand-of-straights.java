class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if(hand.length % groupSize != 0){
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int num : hand){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while(!map.isEmpty()){

            int first = map.firstKey();

            for(int i = 0; i < groupSize; i++){

                int num = first + i;

                if(!map.containsKey(num)){
                    return false;
                }

                map.put(num, map.get(num) - 1);

                if(map.get(num) == 0){
                    map.remove(num);
                }
            }
        }

        return true;
    }
}
