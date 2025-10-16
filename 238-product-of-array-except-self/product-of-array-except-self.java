class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefixArr = new int[length]; 
        int[] suffixArr = new int[length];

        int preProd = 1;
        for (int i = 0; i < length; ++i) { //[1,2,0,4] [1,1,2,0]
            prefixArr[i]=preProd;
            preProd*=nums[i];
        }

        int sufProd = 1;
        for (int i = nums.length - 1; i >= 0; --i) { //[1,2,0,4]
            suffixArr[i]=sufProd;
            sufProd*=nums[i];
        }

        for (int i = 0; i < length; ++i) {
            suffixArr[i] = prefixArr[i] * suffixArr[i];

        }

        return suffixArr;

    }
}