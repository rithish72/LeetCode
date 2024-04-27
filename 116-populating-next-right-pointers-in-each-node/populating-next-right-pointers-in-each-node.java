/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        dfs(root.left,root.right);
        return root;
    }
    void dfs(Node r1, Node r2){
        if(r1 == null){
            return ;
        }
        r1.next = r2;
        dfs(r1.left,r1.right);
        dfs(r1.right,r2.left);
        dfs(r2.left,r2.right);
    }
}