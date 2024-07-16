// 19. 정수 제곱근 판별


class Solution {
    public long solution(long n) {
        long answer=-1;
        int calc;
        
        calc = (int)Math.sqrt(n);
        
        if (Math.pow(calc,2) == n) {
            answer = (long)Math.pow(calc+1,2);
        }
        return answer;
    }
}

class Solution {
    public long solution(long n) {
        long answer=0;
        
        for (long i=1; i<=n; i++) {
            if (i * i == n) {
                answer = (i+1) * (i+1);
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
