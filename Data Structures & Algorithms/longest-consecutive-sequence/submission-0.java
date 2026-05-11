class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLen = 0;
        for (int num: nums) set.add(num);

        for(int n : nums) {
            if(!set.contains(n-1)) {
                int curLen = n;
                int len = 1;

                while(set.contains(curLen +1)) {
                    curLen++;
                    len++;
                }

                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
