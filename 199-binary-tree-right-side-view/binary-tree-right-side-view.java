/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        helper(root,al,0);
        return (al);
    }
    private static void helper(TreeNode root,List<Integer> al,int currDepth){
        if(root == null){
            return ;
        }
        if(currDepth == al.size()){
            al.add(root.val);
        }
        helper(root.right, al, currDepth + 1);
        helper(root.left, al, currDepth + 1);
    }
}