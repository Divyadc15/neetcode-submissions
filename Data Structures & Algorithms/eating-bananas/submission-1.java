class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,hi=Arrays.stream(piles).max().getAsInt();
        int ans=h;
        while(l<=hi){
            int mid=l+(hi-l)/2;
            if(possilbe(piles,h,mid)==true){
                ans=mid;
                hi=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    boolean possilbe(int[]piles,int h,int mid){
        long hours=0,n=piles.length;
        for(int i=0;i<n;i++){
            hours+=(piles[i]+mid-1)/mid;
        }
        if(hours<=h) return true;
        return false;
    }
}