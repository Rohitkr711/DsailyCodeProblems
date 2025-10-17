class Solution {
    public void sortColors(int[] arr) {
        // int length = arr.length;
        // int[] countArr = new int[3];

        // for (int i = 0; i < length; ++i) {
        //     countArr[arr[i]]++;
        // }

        // int k=0;
        // for (int j = 0; j < 3; ++j) {
        //     while(countArr[j]-->0){ 
        //         arr[k++]=j; 
        //     }
        // }

        // return arr;


        int length = arr.length;
        int i=0, j=0, k=length-1;

        while(j<=k){ // [2,0,2,1,1,0]

        if(arr[j]==0){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            ++i;
            ++j;

        }else if(arr[j]==2){
            int temp = arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
            --k;

        }else{
            ++j;
        }

        }

//    j=4
//    i=2
//    k=3
//    [0,0,1,1,2,2]

        
    }
}