/*The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.*/
class Solution {
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1,sum=0;
         if(n==1) return t1;
        else if(n==2) return t1;
        for(int i=2;i<n;i++){
            sum=t0+t1+t2;
            t0=t1;
             t1=t2;
            t2=sum;
}
        return sum;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Solution s=new Solution();
System.out.println(s.tribonacci(n));
}
}
