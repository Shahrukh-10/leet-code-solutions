class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int profit=prices[j]-prices[i];
                if(profit > max)
                {
                    max=profit;
                }
            }
        }
        return max;      
}}
