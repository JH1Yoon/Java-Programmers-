// 21. 하샤드 수

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] str = Integer.toString(x).split("");
        
        int digit = 0;
        
        for (String s : str) {
            digit += Integer.parseInt(s);
        }
        
        if (x%digit != 0)
            answer = false;
        
        return answer;
    }
}
