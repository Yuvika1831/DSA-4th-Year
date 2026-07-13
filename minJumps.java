public static int minJumps(int[] nums) {
    int n = nums.length;

    if (n <= 1)
        return 0;

    if (nums[0] == 0)
        return -1;

    int jumps = 0;
    int currentEnd = 0;
    int farthest = 0;

    for (int i = 0; i < n - 1; i++) {
        farthest = Math.max(farthest, i + nums[i]);

        if (i == currentEnd) {
            if (farthest == currentEnd)
                return -1;   // Cannot move further

            jumps++;
            currentEnd = farthest;

            if (currentEnd >= n - 1)
                return jumps;
        }
    }

    return currentEnd >= n - 1 ? jumps : -1;
}
