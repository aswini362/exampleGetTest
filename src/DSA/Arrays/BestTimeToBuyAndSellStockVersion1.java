package DSA.Arrays;

public class BestTimeToBuyAndSellStockVersion1 {
    public static void main(String[] args) {
       int[] nums= {7,1,5,3,6,4};
       System.out.println(maxProfit(nums));

    }


    /*minPrice = Math.min(minPrice, arr[i]);
    maxPro = Math.max(maxPro, arr[i] - minPrice);*/
    public static int maxProfit(int[] prices) {
        int maximumProfit=0;
        int minPrices=Integer.MAX_VALUE;
        for (int price:prices){
            if(price<minPrices){
                minPrices=price;
            }else{
                int profit=price-minPrices;
                if(profit>maximumProfit){
                    maximumProfit=profit;
                }
            }
        }

        return maximumProfit;

    }
}
