/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        if(root == null)
            return new ArrayList<>();
        
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        List<Integer> ans = new ArrayList<>();
        
        while(!stack.isEmpty()){
            
            Node temp = stack.pop();
            
            ans.add(temp.val);
            
            
            if(temp.children != null){
                
                List<Node> temper = temp.children;
                Collections.reverse(temper);
                stack.addAll(temper);
            }
            
        }
        
        return ans;
        
    }
}