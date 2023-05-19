/* Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique. */



class Solution {
            List<List<Integer>> finalList=new ArrayList<List<Integer>>();

    public void recurse(int [] nums,int index,List<Integer>path){
        if(index==nums.length)
        {
            finalList.add(new ArrayList(path));
           // System.out.println(finalList);
        }
        else{
            path.add(nums[index]);
            recurse(nums,index+1,path);
            path.remove(path.size()-1);
            recurse(nums,index+1,path);

       }
    }
    public List<List<Integer>> subsets(int[] nums) {
    
       List<Integer> path=new ArrayList();
        recurse(nums,0,path);
        return finalList;
    }
}
