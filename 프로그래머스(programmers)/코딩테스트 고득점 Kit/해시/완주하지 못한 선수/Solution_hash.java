package 프로그래머스.해시.완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

public class Solution_hash {

    public String solution(String[] participant, String[] completion) {

        // 1. 해쉬맵을 사용한다.
        HashMap<String, Integer> map = new HashMap<>();

        // 2. 참가자, 수를 (키, 값)으로 추가
        for(String member : participant) {
            map.put(member, map.getOrDefault(member, 0) + 1);
        }
        // getOrDefault : 동명이인인 사람이 있을 수 있어서, 이미 존재하는 참가자 이름을 추가
        // 없다면 '0'으로 시작해 1씩 더함

        // 3. 완주한 선수를 찾아서 해당 키의 값을 -1 해준다.
        // 동명이인인 사람이 있을 수 있기 때문에 -1로 한명씩 없애주도록 한다.

        for(String member: completion){
            map.put(member, map.get(member) - 1);
        }

        // 4. 이제 해당 해쉬맵에서 값이 0이 아닌 값을 확인해서 반환
        // entrySet이 아니라, keySet으로 접근하는것도 좋은 방법
        // ex) for(String member : map.keySet())
        String member = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            member = entry.getKey();
            // 통과하지 못했다면. 반복을 종료하면서 해당 이름을 반환
            if(entry.getValue() != 0){
                break;
            }
        }

        return member;

    }
}
