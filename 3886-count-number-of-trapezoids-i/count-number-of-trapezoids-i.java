class Solution {
    private int MOD = 1000000007;    
    public int countTrapezoids(int[][] points) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int[] point: points){
            int y = point[1];
            freq.put(y, freq.getOrDefault(y, 0) + 1);
        }

        long sum = 0;
        long ans = 0;
        for(int yCount: freq.values()){
            long noOfPairs = ((long)yCount * (yCount - 1)) / 2;
            ans = (ans + sum * noOfPairs) % MOD;
            sum = (sum + noOfPairs) % MOD;
        }
        return (int)(ans);
    }
}