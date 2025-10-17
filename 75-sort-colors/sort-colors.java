class Solution {
    public void sortColors(int[] arr) {
        int length = arr.length;
        int[] countArr = new int[3];

        for (int i = 0; i < length; ++i) {
            countArr[arr[i]]++;
        }

        int k=0;
        for (int j = 0; j < 3; ++j) {
            while(countArr[j]-->0){
                arr[k++]=j;
            }
        }

        // return arr;


        // int length = arr.length;
        // int i=0, j=0, k=length-1;


        // for (int j = 0; j < length; ++j) {
        //     if (countArr[0] > 0) {
        //         arr[j] = 0;
        //         --countArr[0];
        //     } else if (countArr[1] > 0) {
        //         arr[j] = 1;
        //         --countArr[1];
        //     } else {
        //         arr[j] = 2;
        //         --countArr[2];
        //     }
        // }
    }
}