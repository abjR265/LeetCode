class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int start[] = new int[intervals.length];
        int end[] = new int[intervals.length];
        
        for (int i=0; i<intervals.length; i++){
            start[i] = intervals [i][0];
            end[i] =  intervals[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        int room=0;
        
        for (int j =0, k=0; j<intervals.length; j++){
            if (start[j]<end[k]){
                room++;
            }
            else{ k++;}
        }
        
    
    return room;
}
}