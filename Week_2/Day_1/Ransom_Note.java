class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] r = new int[26];

        for (char ch : magazine.toCharArray()) {
            r[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (r[ch - 'a'] == 0) {
                return false;
            }
            r[ch - 'a']--;
        }

        return true;
    }
}