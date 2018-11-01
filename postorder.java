



public static List<Integer> postorderTraversal(TreeNode node){
	// Error check
	if(node == null) return new ArrayList<Integer>();

	List<Integer> solution = new ArrayList<Integer>();
	Stack<TreeNode> stack = new Stack<TreeNode>();

	TreeNode curr = node;
	stack.add(curr);

	while( !stack.isEmpty() || curr!=null ){

		if(curr.right != null){
			stack.add(curr);
			curr = curr.right;
		}

		if(curr.left != null){
			stack.add(curr);
			curr = curr.left;
		}

	}

	return solution;
}




public static List<Integer> postorderTraversal(TreeNode node){
	// Error check
	if(node == null) return new ArrayList<Integer>();

	List<Integer> solution = new ArrayList<Integer>();
	Stack<TreeNode> stack = new Stack<TreeNode>();

	TreeNode curr = node;

		while(!stack.isEmpty() || curr != null){

			// go as left as possible
			if(curr != null){
				stack.add(curr);
				curr = curr.left;
			}else{
				// go up,
				curr = stack.peek();
				solution.add(stack.pop().val);
				// go as far right as possible
				curr = curr.right;
			}
		}

	return solution;
}


