class Solution {
    public int maxDepth(String s) {
        int c = 0, max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                c++;
            }
            else if(s.charAt(i) == ')'){
                c--;
            }
            if(max < c){
                max = c;
            }
        }
        return max;
    }
}