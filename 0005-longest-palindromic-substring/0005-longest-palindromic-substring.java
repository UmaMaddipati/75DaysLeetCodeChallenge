class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int max_len = 1;
        String max_str = s.substring(0, 1);
        s = "#" + s.replaceAll("", "#") + "#";
        int[] dp = new int[s.length()];
        int center = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < right) {
                dp[i] = Math.min(right - i, dp[2 * center - i]);
            }

            while (i - dp[i] - 1 >= 0 && i + dp[i] + 1 < s.length() && s.charAt(i - dp[i] - 1) == s.charAt(i + dp[i] + 1)) {
                dp[i]++;
            }

            if (i + dp[i] > right) {
                center = i;
                right = i + dp[i];
            }

            if (dp[i] > max_len) {
                max_len = dp[i];
                max_str = s.substring(i - dp[i], i + dp[i] + 1).replaceAll("#", "");
            }
        }

        return max_str;
    }
}