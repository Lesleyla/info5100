package others.FinalList.BuyandSellStock;
//leetcode121
public class Main {
    public static void main(String[] args) {
        int[] prices = {3,4,3,2,3,4,5,6,7,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // least so far
        int profit = 0; // profit if sold today
        for (int i = 0; i < prices.length; i ++) {
            if (prices[i] <= lsf) {
                lsf = prices[i];
            } else { //prices[i]>lsf
                profit = Math.max(profit, prices[i]-lsf);
            }
        }
        return profit;

//        int lsf = Integer.MAX_VALUE;
//        int op = 0;
//        int pist = 0;
//
//        for(int i = 0; i < prices.length; i++){
//            if(prices[i] < lsf){
//                lsf = prices[i];
//            }
//            pist = prices[i] - lsf;
//            if(op < pist){
//                op = pist;
//            }
//        }
//        return op;
    }
}
