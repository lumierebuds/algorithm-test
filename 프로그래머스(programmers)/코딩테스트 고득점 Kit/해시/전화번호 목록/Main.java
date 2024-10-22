package 프로그래머스.해시.전화번호_목록;

public class Main {
    public static void main(String[] args) {
        String[] phone_book = {"12", "2434312"};
        boolean solution = new Solution_starts_with_활용().solution(phone_book);
        System.out.println(solution);
    }
}
