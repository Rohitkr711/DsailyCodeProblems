class Solution {
    public int maxProfit(int[] prices) {
        // int ans = 0;
        
        // for(int i=0; i<prices.length;++i){

        //     for(int j=i+1;j<prices.length;++j)
        //     ans = (int)(Math.max(ans,prices[j]-prices[i]));
        // }
        // return ans;


        int ans=0;
        int minBuyPrice = prices[0];

        for(int i=1;i<prices.length;++i){

            if(prices[i]<minBuyPrice){
                minBuyPrice = prices[i];

            }else{
                ans = (int)Math.max(ans,prices[i]-minBuyPrice);

            }
            // minBuyPrice = (int)Math.min(minBuyPrice, prices[i]);
            // ans = (int)Math.max(ans,prices[i]-minBuyPrice);
            // ans = (int)Math.max(ans,profit);

        }

        return ans;








    }
}