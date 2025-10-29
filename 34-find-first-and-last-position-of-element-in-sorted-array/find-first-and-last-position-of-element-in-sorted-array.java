class Solution {

    static int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid > 0 && nums[mid - 1] == target)
                    high = mid - 1;
                else {
                    return mid;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

        static int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid < nums.length-1 && nums[mid + 1] == target)
                    low = mid + 1;
                else {
                    return mid;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }


    public int[] searchRange(int[] nums, int target) {
        int[] resultArr = new int[2];
        int lbIdx = lowerBound(nums, target);
        resultArr[0]=lbIdx;
        int ubIdx = upperBound(nums, target);
        resultArr[1]=ubIdx;
        return resultArr;

    }
}