// 12. 평균 구하기

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for (Integer i : arr)
        {
            answer += i;
        }
        
        answer = answer / arr.length;
        return answer;
    }
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int sum = 0;
        for (int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        
        answer = (double)sum / arr.length;
        return answer;
    }
}
