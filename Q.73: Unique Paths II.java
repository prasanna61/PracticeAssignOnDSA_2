class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int m=Grid.length;
        int n=Grid[0].length;
        if(Grid[0][0]==1){
            return 0;
        }
        int dp[][]=new int[m][n];
        for(int i=0;i<n;i++){
            if(Grid[0][i]==0){
                dp[0][i]=1;
            }else{
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(Grid[i][0]==0){
                dp[i][0]=1;
            }else{
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(Grid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
