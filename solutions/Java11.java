// 11. 짝수와 홀수

class Solution {
    public String solution(int num) {
        String answer = "";
        
        answer = (num%2==0) ? "Even" : "Odd";
        return answer;
    }
}

class Solution {
    public String solution(int num) {
        String answer = "Odd";
        
        if (num % 2 ==0)
            answer = "Even";
        return answer;
    }
}
