class Solution {
    public int findTheLongestSubstring(String s) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int mask = 0;
        int maxLen = 0;

        map.put(0, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a') mask ^= 1;
            else if (ch == 'e') mask ^= 2;
            else if (ch == 'i') mask ^= 4;
            else if (ch == 'o') mask ^= 8;
            else if (ch == 'u') mask ^= 16;

            if (map.containsKey(mask)) {
                maxLen = Math.max(maxLen, i - map.get(mask));
            } else {
                map.put(mask, i);
            }
        }

        return maxLen;
    }
}