class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long l = 1, h = 10000000000000000L;

        while (l < h) {
            long mid = (l + h) >> 1;
            long tot = 0;
            for (int i = 0; i < workerTimes.length && tot < mountainHeight; i++)
                tot += (long) (Math.sqrt((double) mid / workerTimes[i] * 2 + 0.25) - 0.5);
            if (tot >= mountainHeight)
                h = mid;
            else
                l = mid + 1;
        }

        return l;
    }
}