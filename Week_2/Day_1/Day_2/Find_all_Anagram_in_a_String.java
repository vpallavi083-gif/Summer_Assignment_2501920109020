class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        char[] r = p.toCharArray();
        Arrays.sort(r);

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String sub = s.substring(i, i + p.length());

            char[] t = sub.toCharArray();
            Arrays.sort(t);

            if (Arrays.equals(r, t)) {
                ans.add(i);
            }
        }

        return ans;
    }
}