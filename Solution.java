/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9

Output: [0,1]

Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/




class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
     
        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
        for(int j=0;j<nums.length && j!=i;j++){
        if(nums[j]==find){
            arr[0]=j;
            arr[1]=i;            
}}}        
        return arr;
    }
    public static void main (String args[]){
    Scanner sc =new Scanner(System.in);
    String s=sc.nextLine();
    s=s.replace("[","");
    s=s.replace("]","");
    s=s.replace(",","");
    System.out.println(s);
    int target=sc.nextInt();
    int nums[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
            nums[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Solution s1=new Solution();   
      System.out.println(Arrays.toString(s1.twoSum(nums,target)));
} }
