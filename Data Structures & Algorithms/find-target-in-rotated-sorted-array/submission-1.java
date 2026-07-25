class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int index=solve(nums,n);
        int idx=binarySearch(0,index-1,nums,target);//left side of pivot index
        if(idx!=-1) return idx;
        idx=binarySearch(index,n-1,nums,target);
        return idx;
    }
    int solve(int[] nums, int target){
        int l=0,h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h]) l=mid+1;
            else{
                h=mid;
            }
        }
        return h;
    }
    int binarySearch(int l,int h,int[] nums,int target){
        int idx=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                idx=mid;
                break;
            }
            else if(nums[mid]<target) l=mid+1;
            else{
                h = mid-1;
            }
        }
        return idx;
    }
}
