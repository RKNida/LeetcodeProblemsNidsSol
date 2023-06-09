/* Fibonnaci using Tabulation
Tabulation
runtime=0ms
memory=39.2MB
vs 
Memoization
runtime=0ms
memory=39.4MB

Recursive
runtime=8ms
memory=39.3MB

*/
class Solution {
        

    public  int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int dp[]=new int[n+1];//imp - n+1
         
        dp[0]=0;dp[1]=1;
        for(int i=2;i<=n;i++)
        dp[i]=dp[i-1]+dp[i-2];//replace fib(N)with fib(i)      

     return dp[n];    
        
        
    }
}
