class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a1, a2) -> (a1[0]-a1[1])-(a2[0]-a2[1]));
        int c = 0;
        for (int i=0; i<costs.length/2; i++){
            c += costs[i][0] + costs[i+costs.length/2][1];
        }
        return c;
        
        
    }
}