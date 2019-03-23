    

    public int leastInterval(char[] tasks, int n) {

    	int [] map = new int[tasks.length];
    	int time = 0;

    	// Map the frequency of every letter
    	for(char task : tasks){
    		map[task - 'A']++;
    	}
    	Arrays.sort(map);

    	// Since the most used letter is at the end of the array,
    	// we can use it as the bound for our while loop
    	while(map[25] > 0){	
    		int i = 0;
    		int j = 25;
    		while(i <= n && map[j] > 0){
    			map[j]--;
    			time++;		// one cycle passed
    			i++;		// counter for potential cool off period

    			// If j == 0 we have reached a portion of the array in which the frequency count is 0
    			// Therefore no index below the current j value holds anything on interest so we reset
    			// to 25. If the condition doesn't hold through we decrement
    			j = (j == 0) ? 25 : j - 1;	

    		}

    		Arrays.sort(map);	// sort by frequency again

    		if(map[25] == 0) break;

    		time = time + (n - i + 1);

    	}

    	return time;
    }

