class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int x : prices){
            if(x < min){
                min2 = min;
                min = x;
            }
            else if(x < min2){
                min2 = x;
            }
        }
        if(min+min2 <= money) return money-(min+min2);
        return money;
    }
}