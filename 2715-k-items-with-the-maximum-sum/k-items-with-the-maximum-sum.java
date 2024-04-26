class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k == 0){
            return 0;
        }

        int sum = 0;

        if(k!=0){
            if(k <= numOnes){
                sum += k;
                k = 0;
            }
            else{
                k -= numOnes;
                sum += numOnes;
                numOnes = 0;
            }
        }
        if(k!=0){
            if(k <= numZeros){
                k = 0;
            }
            else{
                k -= numZeros;
                numZeros = 0;
            }
        }if(k!=0){
            if(k <= numNegOnes){
                sum -= k;
                k = 0;
            }
            else{
                k -= numNegOnes;
                sum -= numNegOnes;
                numNegOnes = 0;
            }
        }
        return sum;
    }
}