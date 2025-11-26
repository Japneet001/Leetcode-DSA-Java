class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return ;
        }
        int i = 0;  // pointer to position next non-zero
        for(int j = 0; j < n; j++){
            if(nums[j] != 0){
                if(i != j){
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                }
                i++;
            }

        }
    }
}

