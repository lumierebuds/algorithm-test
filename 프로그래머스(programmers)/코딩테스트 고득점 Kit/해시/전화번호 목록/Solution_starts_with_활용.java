package 프로그래머스.해시.전화번호_목록;

import java.util.Arrays;

public class Solution_starts_with_활용 {

    public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        boolean result = true;

        for(int i=0; i<phoneBook.length-1; i++){ // 마지막 전까지 반복시킴, 그렇지 않으면, IndexOutOfBound 오류 발생
            if(phoneBook[i+1].startsWith(phoneBook[i])){ // startsWith로 시작하는 문자열인지 확인
                result = false;
                break;
            }
        }
        return result;

    }
}
