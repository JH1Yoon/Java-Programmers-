// 35. 부족한 금액 계산하기

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for (int i=1; i<=count; i++) {
            answer += price * i;
        }
        
        return (answer - money < 0) ? 0 : answer-money;
    }
}
