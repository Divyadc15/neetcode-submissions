class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(text1,text2,text1.length(),text2.length(),dp);
    }
    int solve(String s1,String s2,int m,int n,int[][]dp){
        if(m==0||n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dp[m][n]=1+solve(s1,s2,m-1,n-1,dp);
        }
        return dp[m][n]=Math.max(solve(s1,s2,m-1,n,dp),solve(s1,s2,m,n-1,dp));
    }
}
