



class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList[] graph = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        Queue queue = new LinkedList();
        int count = 0;
 
        for(int i = 0; i < numCourses; i++)	graph[i] = new ArrayList();

        for(int i = 0; i < prerequisites; i++){
        	degree[prerequisites[i][1]]++;
        	degree[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for(int i = 0; i < degree.length; i++){
        	if(degree[i] == 0){
        		queue.add(i);
        		count++;
        	}
        }

        while(queue.size() != 0){
        	int course = (int) queue.poll();
        	for(int i = 0; i < graph)
        }
      

    }
}




// DFS Solution

public boolean canFinish(int numCourses, int[][] prerequisites) {

		// Use boolean array in order to keep track of what has been visited
		boolean[] visited = new boolean[numCourses];
		// Use a link list
		LinkedList<LinkedList<Integer>> l = new LinkedList(); 

		for(int i = 0; i < visited.length; i++) l.add(i, new LinkedList());

		for(int[] prereq : prerequisites) l.get(prereq[1]).add(prereq[0]);

		for(int i =0; i < visited.length; i++){
			if(!visited[i] && !dfs(l, i, new boolean[visited.length], visited));
				return false;
		} 
        return true;
    }

public boolean dfs(LinkedList<LinkedList<Integer>> l, int node, boolean[] visiting, boolean [] visited){

	if(visiting[node]) return false;
	visting[node] = true;
	LinkedList<Integer> neighbors = l.get(node);

	for(Integer neighbor : neighbors){
		if(!dfs(l, neighbor, visiting, visited)) return false;
		visiting[neighbor] = false;
	}

	visited[node] = true;
	return true;
}




// topological sort

public static boolean canFinish(int numCourses, int[][] prerequisites) {
	if (numCourses <= 0)
		return false;
	Queue<Integer> queue = new LinkedList<>();
	int[] inDegree = new int[numCourses];
	for (int i = 0; i < prerequisites.length; i++) {
		inDegree[prerequisites[i][1]]++;
	}
	for (int i = 0; i < inDegree.length; i++) {
		if (inDegree[i] == 0)
			queue.offer(i);
	}
	while (!queue.isEmpty()) {
		int x = queue.poll();
		for (int i = 0; i < prerequisites.length; i++) {
			if (x == prerequisites[i][0]) {
				inDegree[prerequisites[i][1]]--;
				if (inDegree[prerequisites[i][1]] == 0)
					queue.offer(prerequisites[i][1]);
			}
		}
	}
	for (int i = 0; i < inDegree.length; i++) {
		if (inDegree[i] != 0)
			return false;
	}
	return true;
}








