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

        // APPROACH-2 (using Map) [TC]
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; ++i) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>length/2)
            return entry.getKey();
            // System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        return -1;

    }
}