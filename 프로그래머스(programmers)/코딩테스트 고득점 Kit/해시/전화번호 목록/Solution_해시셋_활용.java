package 프로그래머스.해시.전화번호_목록;

import java.util.HashSet;

public class Solution_해시셋_활용 {

    // ** 틀린 문제 ** 시간초과!
    public boolean solution(String[] phone_book){
        boolean answer = true;
        // 1. 전화번호 목록을 해시셋으로 만들어낸다.
        HashSet<String> set = new HashSet<>();

        for(String phone : phone_book){
            set.add(phone);
        }

        // 2. 해시셋의 값을 반복해서 하나씩 확인하도록 한다.
        for(String check : set) {
             for(String phone : phone_book){
                 if(phone.length() < check.length() || check.equals(phone)) // 체크하기 위한것인데 자기자신과 체크하면 안되기 때문에 pass;
                     continue;
                 String head = getHead(phone, check.length()); // 접두어를 가져오기 위한 함수

                 if(head.equals(check)){
                     answer = false;
                     break;
                 }
             }
        }

        return answer;
    }

    // 접두어에 해당하는 문자들을 가져오기
    public String getHead(String phone, int length) {
        StringBuilder sb = new StringBuilder();
        char[] phones = phone.toCharArray();

        for(int i=0; i< length; i++){
            sb.append(phones[i]);
        }
        String head = sb.toString();
        return head;
    }
}
