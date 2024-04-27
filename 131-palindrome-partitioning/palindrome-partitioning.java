class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> output = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        palindromePartition(0, ds, output, s);
        return output;
    }
    public boolean checkPalindrome(String str, int start, int last){
        while(start <= last){
            if(str.charAt(start) != str.charAt(last)) return false;
            start++;
            last--;
        }
        return true;
    }
    public void palindromePartition(int index, List<String> ds, List<List<String>> output, String str){
        if(index == str.length()){
            output.add(new ArrayList<>(ds));
            return;
        }
        for(int i = index; i < str.length(); i++){
            if(checkPalindrome(str, index, i)){
                ds.add(str.substring(index, i + 1));
                palindromePartition(i+1, ds, output, str);
                ds.remove(ds.size()-1);
            }
        }
    }
}