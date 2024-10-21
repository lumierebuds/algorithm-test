package 코딩테스트_입문;

public class Solution {
    public int solution(int num1, int num2) {
        boolean check = (num1 > 0 && num1 <=100 && num2 > 0 && num2 <= 100);
        int answer = 0;
        if(check){
            double temp = (double) num1 / (double) num2;
            answer = (int)(temp * 1000);
        }
                
    
        return answer;
    }
}
