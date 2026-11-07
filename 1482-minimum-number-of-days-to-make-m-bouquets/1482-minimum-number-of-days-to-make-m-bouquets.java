class Solution {
    public boolean canMake(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            left = Math.min(left, bloomDay[i]);
            right = Math.max(right, bloomDay[i]);
        }
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, mid, m, k)) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }
        return left;
    }
}