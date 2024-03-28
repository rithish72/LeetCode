class Solution {
    public int minimumDeletions(String word, int k) {
        int freq[] = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch -'a']++;
        }
        int min = Integer.MAX_VALUE;
        for(int i : freq){
            int curr = 0;
            for(int j : freq){
                curr += j < i ? j : Math.max(0, j-k-i);
            }
            min = Math.min(min,curr);
        }
        return min;
    }
}