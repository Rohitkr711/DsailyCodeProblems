class Solution {
    public boolean check(int[] nums) {
        
        int n = nums.length;
        boolean isSorted=true;
        int count=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i] > nums[(i+1) % n]){
                ++count;
            }
        }
        if(count<2)
            return true;


        return false;
    }
}