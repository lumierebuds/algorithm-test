package 프로그래머스.해시.완주하지_못한_선수;

public class Main {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden", "leo"};
        String[] comp = {"eden", "kiki", "leo"};
        String solution = new Solution_hash().solution(part, comp);

        System.out.println("완주실패 = " + solution);
    }
}
