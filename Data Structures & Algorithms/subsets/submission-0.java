class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        rec(nums,ans,curr,0);
        return ans;
    }
    void rec(int[] nums,List<List<Integer>> ans,List<Integer> curr,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        rec(nums,ans,curr,idx+1);//pick
        curr.remove(curr.size()-1);//not pick
        rec(nums,ans,curr,idx+1);
    }
}