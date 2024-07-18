// 34. 문자열 내림차순으로 배치하기

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray  = s.toCharArray();
        
        Arrays.sort(charArray);
        
        for (int i=charArray.length-1; i>=0; i--)
            answer += Character.toString(charArray[i]);

        System.out.println(answer);
        return answer;
    }
}



import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray  = s.toCharArray();
        
        Arrays.sort(charArray);
        
        String reversedString = new StringBuilder().append(charArray).reverse().toString();
        
        return reversedString;
    }
}
