class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefixArr = new int[length]; //[1,,]
        int[] suffixArr = new int[length];

        int preProd = 1;
        int preTotalProd = 1;
        for (int i = 0; i < nums.length; ++i) { //[1,2,0,4]
            if (nums[i] != 0) {

                preTotalProd *= nums[i];
                preProd = preTotalProd / nums[i];
                prefixArr[i] = preProd;
            } else {

                prefixArr[i] = preTotalProd;
                preTotalProd *= nums[i];
            }
        }

        int sufProd = 1;
        int sufTotalProd = 1;
        for (int i = nums.length - 1; i >= 0; --i) { //[1,2,0,4]
            if (nums[i] != 0) {

                sufTotalProd *= nums[i];
                sufProd = sufTotalProd / nums[i];
                suffixArr[i] = sufProd;
            } else {

                suffixArr[i] = sufTotalProd;
                sufTotalProd *= nums[i];
            }
        }

        for (int i = 0; i < length; ++i) {
            int prod = prefixArr[i] * suffixArr[i];
            suffixArr[i] = prod;

        }

        return suffixArr;

    }
}