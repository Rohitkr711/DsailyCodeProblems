class Solution {
    public int subarraySum(int[] nums, int k) {

        int count=0;
        for(int i=0; i<nums.length;++i){ // [1,2,3]  [1]
            int sum = 0;
            for(int j=i; j<nums.length;++j){  //1
                sum+=nums[j]; //1
                if(sum==k){
                    ++count;
                }
            }
        }
        return count;
        
    }
}