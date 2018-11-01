




// Iterative Traversal
public static List<Integer> inorderTraversal(TreeNode node){

		List<Integer> solution = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();

		TreeNode curr = node;

		while(!stack.isEmpty() || curr != null){

			// go as left as possible
			if(curr != null){
				stack.add(curr);
				curr = curr.left;
			}else{
				// go up,
				curr = stack.pop();
				solution.add(curr.val);
				// go as far right as possible
				curr = curr.right;
			}
		}

	return solution;
}


// Recursive Traversal
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        traversal(root, solution);
        return solution;
    }
    
    public void traversal(TreeNode root, List<Integer> solution){
        if(root == null) return;
        
        traversal(root.left, solution);
        solution.add(root.val);
        traversal(root.right, solution);
        
        return;
    }

