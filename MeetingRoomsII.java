	



	public int minMeetingRooms(Interval[] intervals) {

	    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();


				if(intervals.length < 1) return 0;
        if(intervals.length == 1) return 1;
        
        // The meeting times have been sorted by start times
        Arrays.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval interval1, Interval interval2) {
                return interval1.start-interval2.start;
        }});
        
        int roomsRequired = 1;
         pq.add(intervals[0].end);

        for(int i = 1; i < intervals.length; i++ ){
        	// if suitable room found, remove it and add new room start time
        	if(pq.peek() <= intervals[i].start){
        		pq.poll(); pq.add(intervals[i].end);
        	}
        	else{
        		pq.add(intervals[i].end);
        		roomsRequired++;
        	}
        }

        return roomsRequired;  
    }