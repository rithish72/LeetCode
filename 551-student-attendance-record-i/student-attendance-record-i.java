class Solution {
    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'A'){
                a++;
                if(a == 2){
                    return false;
                }
                l = 0;
            }
            else if(ch == 'P'){
                l = 0;
            }
            else{
                l++;
                if(l == 3){
                    return false;
                }
            }
        }
        return true;
    }
}