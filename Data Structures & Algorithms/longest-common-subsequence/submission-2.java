class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] x=text1.toCharArray();
        char[] y=text2.toCharArray();
        int m=x.length;
        int n=y.length;
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return solve(x,y,m,n,dp);
    }
    int solve(char[] x,char[] y,int m,int n,int[][]dp){
        if(m==0||n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(x[m-1]==y[n-1]) return dp[m][n]=1+solve(x,y,m-1,n-1,dp);
        return dp[m][n]=Math.max(solve(x,y,m-1,n,dp),solve(x,y,m,n-1,dp));
    }
}
