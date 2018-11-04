







// Solution preserving original data/ uses O(n) space
class Solution {
    public int numIslands(char[][] grid) {

    	int n = grid.length;
    	int m - grid[0].length;
    	
    	boolean[][] seen = new boolean[grid.length][grid[0].length];
    	int numOfIslands = 0;

    	for(int i = 0; i < grid.length; i++){
    		for(int j = 0; j < grid[0].length; j++){
    			if(grid[i][j] == '1' && seen[i][j] != true){
    				numOfIslands++;
    				dfs(grid, seen, i, j);
    			}
    		}
    	}

        return numOfIslands;
    }

    public void dfs(char[][] grid, boolean [][] seen, int i, int j){

    	//checks to make sure i and j are within array bounds
    	if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1' || seen[i][j] == true){
    		return;
    	}
    	// mark in the seen array
    	seen[i][j] = true;

    	dfs(grid, seen, i+1, j);
    	dfs(grid, seen, i-1, j);
    	dfs(grid, seen, i, j+1);
    	dfs(grid, seen, i, j-1);

    }



}









// Solution overwrites data in order to provide O(1) space complexity
class Solution {
    public int numIslands(char[][] grid) {

    	int total = 0;
    	// boolean array of size grid
    	// boolean [][] islandSeen = new boolean[grid.length][grid[0].length];
        
        // increment through the 2d array and do a DFS through at each location of an I

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                
                // if this location has an I, do a dfs
                if(char[i][j]=='1'){
                	total++;
                	 dfs(grid, j, i);
                	}
                }
            }
            return total;
        }


        void dfs(char[][] grid, int y, int x){
        // if out of bounds or at a cell with '0' or '*', simply stop and return | end the dfs
        if(x < 0 || x >= grid[0].length || y < 0 || y >= grid.length || grid[y][x] != '1') return;
        
        grid[y][x] = '*'; // destroying visited cells so they are not re-visited
        
        // recursive dfs on all neighbours
        dfs(grid, y + 1, x);
        dfs(grid, y - 1, x);
        dfs(grid, y, x + 1);
        dfs(grid, y, x - 1);
    }
}