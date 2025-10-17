class Solution {
    public int maxSubArray(int[] arr) {
        // int maxSum= (int)(Double.NEGATIVE_INFINITY);
        // int currSum=0;   //

        // for(int i=0;i< arr.length;++i){ //[-2,-1]  | {2,3,-8,6,5,-4,7}
        //     currSum+=arr[i];
        //     maxSum=(int)(Math.max(currSum,maxSum));

        //     if(currSum<0){
        //         currSum=0;
        //     }

        // }
        // return maxSum;


        int maxSum = (int) (Double.NEGATIVE_INFINITY);
        int currSum = arr[0]; //
        maxSum = (int) (Math.max(currSum, maxSum));

        for (int i = 1; i < arr.length; ++i) { //  {-3,-2,-6,-1,-7,-4,3}
            currSum = (int) (Math.max(arr[i], currSum+arr[i]));;
            maxSum = (int) (Math.max(currSum, maxSum));

            // if (currSum < 0) {
            //     currSum = 0;
            // }

        }
        return maxSum;

    }
}