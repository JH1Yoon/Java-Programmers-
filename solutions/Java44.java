// 44. 최소직사각형

class Solution {
    public int solution(int[][] sizes) {
        int preMax = 0;
        int preMin = 0;
        
        for (int[] size : sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);
            
            preMax = Math.max(curMax, preMax);
            preMin = Math.max(curMin, preMin);
        }
        return preMax  * preMin;
    }
}
