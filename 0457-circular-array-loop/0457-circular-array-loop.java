
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int slow = i;
            int fast = i;
            boolean forward = nums[i] > 0;

            while (true) {
                slow = nextIndex(nums, slow);

                if (slow == -1 ||
                    (nums[slow] > 0) != forward) {
                    break;
                }

                fast = nextIndex(nums, fast);

                if (fast == -1 ||
                    (nums[fast] > 0) != forward) {
                    break;
                }

                fast = nextIndex(nums, fast);

                if (fast == -1 ||
                    (nums[fast] > 0) != forward) {
                    break;
                }
                if (slow == fast) {
                    return true;
                }
            }
        }
        return false;
    }
    private int nextIndex(int[] nums, int i) {
        int n = nums.length;
        int next = ((i + nums[i]) % n + n) % n;
        if (next == i) {
            return -1;
        }

        return next;
    }
}
