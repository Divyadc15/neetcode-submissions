class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=0,rm=0;
        int water=0;
        while(l<r){
            lm=Math.max(lm,height[l]);
            rm=Math.max(rm,height[r]);
            if(lm<=rm){
                water+=lm-height[l];
                l++;
            }
            else{
                water+=rm-height[r];
                r--;
            }
        }
        return water;
    }
}
