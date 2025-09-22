class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int maxfreq = 0;
        for(int freq: map.values()){
            maxfreq = Math.max(maxfreq, freq); 
        }

        int totalfreq = 0;
        for(int freq: map.values()){
            if(freq == maxfreq){
                totalfreq += freq;
            }
        }
        return totalfreq;
    }
}