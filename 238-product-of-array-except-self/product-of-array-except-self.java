class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];

        int prod = 1;
        for (int i = 0; i < length; ++i) { //[1,2,0,4]
            ans[i]=prod;
            prod*=nums[i];
        }

        prod=1;
        for (int i = nums.length - 1; i >= 0; --i) { //[1,2,0,4]
            ans[i]=ans[i]*prod;
            prod*=nums[i];
        }

        return ans;

    }
}