class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> idx_map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            idx_map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(idx_map.containsKey(comp) && idx_map.get(comp) != i){
                return new int[] {i, idx_map.get(comp)};
            }
        }
        return new int[] {};
    }
}