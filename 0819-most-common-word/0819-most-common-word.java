class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");

        String[] words = paragraph.split("\\s+");

        HashSet<String> ban = new HashSet<>(Arrays.asList(banned));

        HashMap<String,Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        for(String word : words) {

            if(!ban.contains(word) && word.length() > 0) {

                map.put(word, map.getOrDefault(word,0)+1);

                if(map.get(word) > max) {
                    max = map.get(word);
                    ans = word;
                }
            }
        }

        return ans;
    }
}