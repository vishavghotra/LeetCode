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
 // using prev head curr O(1) space 
	      public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int cnt = q.size();
            for (int i = 0;i < cnt; i++) {
                Node tempNode = q.poll();
                if (tempNode.left != null) q.add(tempNode.left);
                if (tempNode.right != null) q.add(tempNode.right);
                if (q.peek() != null && i < cnt - 1) tempNode.next = q.peek();    //(i < cnt -1)  : not pushing numm at last  To check the whether it's not the last element of a level
            }
        }
        return root;
    
    }
}