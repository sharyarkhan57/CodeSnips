


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> solution = new List<List<Integer>>();
        Queue<Integer> current = new Queue<Integer>();
        Queue<Integer> past = new Queue<Integer>();
        int even = 2;
        current.add(root);

        TreeNode curr = root;
        while(current!== null && past != null){

	       while( current!=null ){

	        	if(even % 2 == 0){
			    	curr = queue.pop();

					if(curr.left != null){
						queue.add(curr.left);
					} 

					if(curr.right != null){
						queue.add(curr.right);
					}
	    		}
        	}


        }
 


    return solution;
    }
}