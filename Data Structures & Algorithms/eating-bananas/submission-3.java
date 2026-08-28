class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(piles,h,mid)==true){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    boolean possible(int[] piles,int h,int mid){
        int hours=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            hours+=(piles[i]+mid-1)/mid;
        }
        if(hours<=h) return true;
        return false;
    }
}
