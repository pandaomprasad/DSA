class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int width,h = 0;
        int totalWater=0;
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            h=Math.min(height[lp],height[rp]);
            width=rp-lp;
            int ans = h*width;
            totalWater=Math.max(totalWater,ans);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return totalWater;
    }
}