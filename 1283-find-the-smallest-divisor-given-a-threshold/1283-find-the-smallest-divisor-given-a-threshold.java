class Solution {
    public boolean isPossible(int[] nums, int divisor, int threshold) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + divisor - 1) / divisor;
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            right = Math.max(right, nums[i]);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPossible(nums, mid, threshold)) {
                right = mid;
            } else {
                left = mid + 1;

            }
        }
        return left;
    }
}