class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i =0; i<nums.length; i++) {
            int left =0, right = 0;
            // left
            for(int j = i-1; j>=0; j--) {
                left += nums[j];
            }
            // right
            for(int j =i+1; j<n; j++) {
                right += nums[j];
            }
            if(left == right) {
                return i;
            }
        }
        return -1;
    }
}