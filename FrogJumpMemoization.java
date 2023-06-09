/*Problem Statement -Frog jump-coding ninjas
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2
4
10 20 30 10
3
10 50 10
Sample Output 1:
20
0
Explanation Of Sample Input 1:
For the first test case,
The frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost).
Then a jump from the 2nd stair to the last stair (|10-20| = 10 energy lost).
So, the total energy lost is 20 which is the minimum. 
Hence, the answer is 20.

For the second test case:
The frog can jump from 1st stair to 3rd stair (|10-10| = 0 energy lost).
So, the total energy lost is 0 which is the minimum. 
Hence, the answer is 0.
Sample Input 2:
2
8
7 4 4 2 6 6 3 4 
6
4 8 3 10 4 4 
Sample Output 2:
7
2
*/

import java.util.* ;
import java.io.*; 

public class Solution {
     static int recurse(int index, int heights[],int dp[]){

         if(index==0)return 0;
        if(dp[index]!=-1)
        return dp[index];
        int left=recurse(index-1,heights,dp)+Math.abs(heights[index]-heights[index-1]);
        int right=Integer.MAX_VALUE;
        if(index>1)
         right=recurse(index-2,heights,dp)+Math.abs(heights[index]-heights[index-2]);

        return dp[index]=Math.min(left,right);

    }
    public static int frogJump(int n, int heights[]) {
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++)
        dp[i]=-1;
      return recurse(n-1,heights,dp);
        // Write your code here..
    }

}
