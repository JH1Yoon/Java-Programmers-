// 20. 정수 내림차순으로 배치하기

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] str = Long.toString(n).split("");
        ArrayList<Long> list = new ArrayList<>();
        
        for(int i=0; i<str.length; i++) {
            list.add(Long.parseLong(str[i]));
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        String result = "";
        
        for (long a : list) {
            result += Long.toString(a);
        }
        
        answer = Long.parseLong(result);
        return answer;
    }
}

