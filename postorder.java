



public static List<Integer> postorderTraversal(TreeNode node){
	// Error check
	if(node == null) return new ArrayList<Integer>();

	List<Integer> solution = new ArrayList<Integer>();
	Stack<TreeNode> stack = new Stack<TreeNode>();

	TreeNode curr = node;
	stack.add(node);

	while( !stack.isEmpty() ){

			curr = stack.pop();
			list.add(0,curr.val);

			if(curr.left != null){
				stack.push(curr.left);
			}
			if(curr.right!=null){
				stack.push(curr.right);
			}
			stack.getSize
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





public static List<Integer> postorderTraversal(TreeNode node){

	List<Integer> solution = new LinkedList<Integer>();
	Stack<TreeNode> stack = new Stack<TreeNode>();
	
	TreeNode curr = node;
	stack.add(node);


	while(!stack.isEmpty()){

		curr = stack.pop();
		list.add(0,curr.val);

		if(curr.left != null){
			stack.push(curr.left);

		}

		if(curr.right != null){
			stack.push(curr.right);
		}


	}

	return solution;
}



















