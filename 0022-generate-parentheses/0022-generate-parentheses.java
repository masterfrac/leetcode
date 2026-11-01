import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        solve(result, "", 0, 0, n);

        return result;
    }
    public void solve(List<String> result, String s,
                      int open, int close, int n) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }
        if (open < n) {
            solve(result, s + "(", open + 1, close, n);
        }
        if (close < open) {
            solve(result, s + ")", open, close + 1, n);
        }
    }
}