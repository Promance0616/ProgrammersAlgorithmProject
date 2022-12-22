import java.util.*;
public class SmallPartString {
    public static void main(String[] args) {
        solution("111111111111111111111111111111", "111111111111111111");
    }
    public static int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length()-p.length()+1; i++){
            if (Long.parseLong(t.substring(i,i+p.length())) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}

//Resource : https://school.programmers.co.kr/learn/courses/30/lessons/147355#