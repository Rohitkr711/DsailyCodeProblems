class Solution {
    public int majorityElement(int[] nums) { // [2,2,1,1,1,2,2]

        // APPROACH-1 (Brute-force)  [ TC->O(n^2) & SC->O(1) ]
        // int length = nums.length;

        // for (int i = 0; i < length; ++i) {
        //     int count = 0;
        //     for (int j = 0; j < length; ++j) {
        //         if (nums[i] == nums[j])
        //             ++count;
        //     }
        //     if (count > length / 2)
        //         return nums[i];
        // }
        // return -1;

        // APPROACH-2 (using Map) [TC->O(n)  & SC->(O(u)->O(n))]
        // int length = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>(); 
        // for (int i = 0; i < length; ++i) {
        //     if (map.containsKey(nums[i])) {
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //     } else {
        //         map.put(nums[i], 1);
        //     }

        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if(entry.getValue()>length/2)
        //     return entry.getKey();
        // }

        // return -1;

        // APPROACH-3 (using sort)

        // Arrays.sort(nums);
        // int idx = nums.length/2;
        // return nums[idx];

        // Approach-4 (Moore voting algo)
        int count = 1;
        int currEle = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (currEle != nums[i]) {
                if (count == 0) {
                    currEle = nums[i];
                    count += 1;
                } else {
                    --count;
                }
            } else {
                ++count;
            }
        }
        return currEle;

    }
}