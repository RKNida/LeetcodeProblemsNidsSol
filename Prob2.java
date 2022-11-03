/*The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).*/

class Solution {
    public int fib(int n) {
        int f1=0,f2=1;
        int sum=0;
        if (n==1) return 1;
        for(int i=1;i<n;i++){
           sum= f1+f2; 
            f1=f2;
            f2=sum;
            }
        return sum;
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
               System.out.println(s.fib(n));



}
}
