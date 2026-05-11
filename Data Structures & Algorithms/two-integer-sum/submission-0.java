class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<int[] , Integer> res_map = new HashMap<>();

        for(int i = 0 ; i< nums.length ; i++ ) {
            for (int j = i+1; j < nums.length; j++) {
                int curr = nums[i];
                int next = nums[j];
                int result = curr + next;

                if(result == target) {
                    return new int[]{i , j};
                }else if(res_map.containsKey(new int[]{result , j})) {
                    return new int[]{res_map.get(new int[]{result , j}) , j};
                }else {
                    res_map.put(new int[]{curr , next} , i);
                }
            }
        }
        return new int[] {};

    }
}
