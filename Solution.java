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
