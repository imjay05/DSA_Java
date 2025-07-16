class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        int newBottles = numBottles; 

        while (newBottles >= numExchange) {
            int exchanged = newBottles / numExchange; 
            int remBottles = newBottles % numExchange; 

            ans += exchanged; 
            newBottles = exchanged + remBottles; 
        }
        
        return ans + numBottles; 
    }
}
