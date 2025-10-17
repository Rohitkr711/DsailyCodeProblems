class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum= (int)(Double.NEGATIVE_INFINITY);
        int currSum=0;   //

        for(int i=0;i< arr.length;++i){ //[-2,-1]
            currSum+=arr[i];
            maxSum=(int)(Math.max(currSum,maxSum));

            if(currSum<0){
                currSum=0;
            }else {
                maxSum = (int) (Math.max(currSum, maxSum));
            }

        }
        return maxSum;
    }
}