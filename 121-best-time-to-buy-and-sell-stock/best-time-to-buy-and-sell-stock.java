class Solution {
    public int maxProfit(int[] prices) {
        // int ans = 0;
        
        // for(int i=0; i<prices.length;++i){

        //     for(int j=i+1;j<prices.length;++j)
        //     ans = (int)(Math.max(ans,prices[j]-prices[i]));
        // }
        // return ans;

        int min=prices[0];
        int ans =0;
        int profit;

        for(int i=0;i<prices.length;++i){
            min=Math.min(min,prices[i]);
            profit = prices[i]-min;
            ans = Math.max(profit,ans);

        }

        return ans;



    }
}