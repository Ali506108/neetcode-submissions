class Solution {
    public int maxArea(int[] nums) {
        int res = 0;


        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > 0 ; j--) {
                int area = (j - i) * Math.min(nums[i], nums[j]);
                res = Math.max(res , area);
            }
        }
        
        return res;
    }

}
