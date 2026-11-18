
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            ans[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            for (int i = 0; i < n; i++) {
                result[i + 1] = ans[i];
            }
            return result;
        }
        return ans;
    }
}
