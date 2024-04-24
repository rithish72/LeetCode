class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int Tn = 0,Tn1 = 1, Tn2 = 1,Tn3 = 0;
        for(int i=3;i<=n;i++){
            Tn3 = Tn + Tn1 + Tn2;
            Tn = Tn1;
            Tn1 = Tn2;
            Tn2 = Tn3;
        }
        return Tn3;
    }
}