class Solution {
    public int differenceOfSums(int n, int m) {
        int sumDivisible = 0, sumNotDivisible = 0;
        for(int i = 1;i<=n;i++){
            if(i%m == 0){
                sumDivisible += i;
            }
            else{
                sumNotDivisible += i;
            }
        }
        return sumNotDivisible - sumDivisible;
    }
}