class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c== 'a' || c == 'e' || c=='i' || c=='o' || c=='u'){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
            else{
                hm.put(c, hm.getOrDefault(c, 0)+1);
            }
        }
        int maxVowelFreq = 0;
        if (!map.isEmpty()) {
            maxVowelFreq = map.values().stream().max(Integer::compare).get();
        }

        int maxConsonantFreq = 0;
        if (!hm.isEmpty()) {
            maxConsonantFreq = hm.values().stream().max(Integer::compare).get();
        }

        return maxVowelFreq + maxConsonantFreq;
    }
}