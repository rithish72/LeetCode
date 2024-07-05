class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] alpha = new int[26];
        for (char c : magazine.toCharArray())
            alpha[c -'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (alpha[c - 'a'] == 0)
                return false;
            alpha[c - 'a']--;
        }
        return true;
    }
}