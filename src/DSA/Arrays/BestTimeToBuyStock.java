package DSA.Arrays;

public class BestTimeToBuyStock {

    public static void main(String [] args){
        int[] prices={7,1,5,3,6,4};
        System.out.println(bestTimeToSellStock(prices));
    }

    public static int bestTimeToSellStock(int [] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else{
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
        }

        return maxProfit;
    }
}
