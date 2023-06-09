/*
optimizing space complexity. 
Runtime -0ms
memory=39.8mb(expected- as array removed, no space)
*/
class Solution {
        

    public  int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;        
        int prev2=0,prev1=1;//imp first declare prev2 then prev1
        for(int i=2;i<=n;i++){
        int curr =prev1+prev2;//replace fib(N)with fib(i)   
        prev2=prev1;   
        prev1=curr;
        }
     return prev1;    
        
        
    }
}
