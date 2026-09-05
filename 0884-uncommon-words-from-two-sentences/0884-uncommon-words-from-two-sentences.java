class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String s = s1 + " " + s2;
        String[] words = s.split(" ");

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {

            int count = 0;

            for(int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                }
            }

            if(count == 1) {
                list.add(words[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}