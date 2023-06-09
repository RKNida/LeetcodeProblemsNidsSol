/*
Fibonacci using Memoization(better than recursive)

Recursive 
Runtime -8 ms
Memory -39.3MB

Memoization
Runtime - 0ms
Memory -39.4MB

*/

class Solution {
        public int fibbonacci(int n,int dp[]){
        if(n<=1)
        return n;      

        if(dp[n]!=-1)
        return dp[n];

        
        return dp[n]= fibbonacci(n-1,dp)+fibbonacci(n-2,dp);
        }

    public  int fib(int n) {
        int dp[]=new int[n+1];//imp - n+1
         
        for(int i=0;i<=n;i++)
        dp[i]=-1;

     return fibbonacci(n,dp);    
        
        
    }
}
