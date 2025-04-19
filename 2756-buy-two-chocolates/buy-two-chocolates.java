class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices) ;
        int val = money - (prices[0] + prices[1]) ;
        if(val < 0){
            return money ;
        }
        return val ;
    }
}