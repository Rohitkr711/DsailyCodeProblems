class Solution {
    public int searchInsert(int[] nums, int target) {
        // APP-1 (BF)
        // int idx = nums.length;
        // for(int i=0;i<idx;++i){
        //     if(nums[i]>=target)
        //     return i;
        // }
        // return idx;

        // APP-2 (using BS)
        int high = nums.length-1;
        int low = 0;
        int ans = high+1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

        // APP-3 (using BS, ans<->low)



    }
}