class Solution {
    public int maxProfit(int[] prices) {
        // int ans = 0;
        
        // for(int i=0; i<prices.length;++i){

        //     for(int j=i+1;j<prices.length;++j)
        //     ans = (int)(Math.max(ans,prices[j]-prices[i]));
        // }
        // return ans;


        int ans=0;
        int profit=0;
        int minBuyPrice = prices[0];

        for(int i=0;i<prices.length;++i){
            minBuyPrice = (int)Math.min(minBuyPrice, prices[i]);
            profit = (int)Math.max(profit,prices[i]-minBuyPrice);
            ans = (int)Math.max(ans,profit);

        }

        return ans;








    }
}