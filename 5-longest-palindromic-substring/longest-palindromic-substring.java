class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String maxStr = "";
        for(int i = 0;i<s.length();i++){
            String substr = "";
            for(int j=i; j<s.length(); j++){
                if(palindrome(s.substring(i, j+1))){
                    substr = s.substring(i, j+1);
                }
                if(maxStr.length() < substr.length()){
                    maxStr = substr;
                }
            }
        }    
        return maxStr;    
    }
    
    private Boolean palindrome(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}