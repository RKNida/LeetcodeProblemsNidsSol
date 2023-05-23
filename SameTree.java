/*Asked in my Google - Question- 2 dices A & B. if A>B then A wins. Find number of times A wins. eg: A= 1,2,3 B=1,2,0 A wins 1 time.
100.Same Tree
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
 

Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104*/

class Solution {
      
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null )return true; 
        if(p!=null && q!=null){ //p.val!= null doesnt work 
          if(p.val==q.val){
         return   isSameTree(p.left,q.left) && isSameTree(p.right,q.right);//Most imp condition both should be valid       
        }else
        return false;
        }
        return false;
    }
}
