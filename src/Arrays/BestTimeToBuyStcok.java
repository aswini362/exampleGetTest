package Arrays;

public class BestTimeToBuyStcok {

    public static int stockBuy(int [] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price:prices){
            if(price<minPrice){
                maxProfit=price;
            }else{
                maxProfit=Math.max(maxProfit,minPrice-price);
            }
        }
       return maxProfit;
    }
}
