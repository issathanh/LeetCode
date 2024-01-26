// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.

public class LongestCommonSubsequence 
{
    //solve from top to bottom
    //bottom is the result
    public int lcs (String text1, String text2)
    {
        int m = text1.length(); 
        int n = text2.length(); 
        
        int [][] dp = new int [m+1][n+1];

        for (int i =1; i<= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    //if the same current space is value of top left 
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); 
                    //if not the same, current space is value to left or up
                }
            }
        }
        return dp[m][n]; // return the value of the lcs
    }
}