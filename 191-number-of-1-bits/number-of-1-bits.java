public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n==0) return 0;
        int count=1,rem;
        while(n/2 != 0){
            rem = n%2;
            if(rem == 1){
                count++;
            }
            n /= 2;
        }
        return count;
    }
}