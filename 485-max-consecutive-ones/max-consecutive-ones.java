class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int prevCount=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==1){
                ++count;
            }
            else{
                prevCount = Math.max(prevCount,count);
                count=0;
                
            }
        }
        prevCount = Math.max(prevCount,count);
        return prevCount;
        
    }
}