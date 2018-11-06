// Iterative Traversal
public static List<Integer> inorderTraversal(TreeNode node){

		List<Integer> solution = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();

		TreeNode curr = node;

		while(!stack.isEmpty() || curr != null){

			// go as left as possible
			if(curr != null){
				stack.add(curr);
				solution.add(curr.val);
				curr = curr.left;
			}else{
				// go up,
				curr = stack.pop();
				// go as far right as possible
				curr = curr.right;
			}
		}

	return solution;
}