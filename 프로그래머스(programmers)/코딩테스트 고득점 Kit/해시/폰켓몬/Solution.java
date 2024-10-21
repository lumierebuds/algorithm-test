package 프로그래머스.해시.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution (int[] nums) {

        Set<Integer> set = new HashSet<>();
        int limit = nums.length / 2; // 최대 n/2 마리의 폰켓몬을 가지고 갈 수 있음

        for (int num : nums) {
            set.add(num);
        }
        // 데려갈 수 있는 폰켓몬의 갯수를 초과할때
        // 제한된 크기를 반환하도록 한다.
        if(set.size() > limit) {
            return limit;
        } else{
            return set.size();
        }
    }
}
