// 43. 크기가 작은 부분

class Solution {
    public int solution(String t, String p) {
        int length = t.length()-p.length()+1;
        int answer = 0;
        
        for (int i=0; i<length; i++) {
            String temp = t.substring(i, i+p.length());
            
            if (Long.parseLong(temp)<=Long.parseLong(p))
                answer++;
        }
        return answer;
    }
}