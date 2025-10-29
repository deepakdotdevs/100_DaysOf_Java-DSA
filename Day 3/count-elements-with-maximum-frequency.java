class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i =0; i<nums.length; i++) {
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        List<Integer> values = new ArrayList<>(freq.values());
        for(int i =0; i<values.size(); i++) {
            int val = values.get(i);
            if(val > maxFreq) {
                maxFreq = val;
            }
        }

        int total = 0;
        for(int i =0; i<values.size() ;i++) {
            int val = values.get(i);
            if(val == maxFreq) {
                total += val;
            }
        }
        return total;
    }
}