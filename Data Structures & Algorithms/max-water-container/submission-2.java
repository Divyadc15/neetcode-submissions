class Solution 
{
    public int maxArea(int[] height) 
    {
        int curr=0;
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
           curr=Math.min(height[i],height[j])*(j-i);
           max=Math.max(curr,max);
                if(Math.min(height[i],height[j])==height[i])
                {
                i++;
                }
                else
                j--;  
        }
    return max;   
    }
}