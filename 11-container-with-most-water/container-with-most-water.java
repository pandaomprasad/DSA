class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int lp = 0;
        int rp = n - 1;
        while (lp < rp) {
            int h = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int ans = width * h;
            maxWater = Math.max(maxWater, ans);
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
}