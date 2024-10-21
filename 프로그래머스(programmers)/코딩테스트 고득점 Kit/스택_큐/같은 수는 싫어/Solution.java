package 알고리즘_고득점_키트.스택_큐.같은숫자는싫어;

import java.util.Stack;

public class Solution {
	
	public int[] solution(int[] arr) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(arr[0]);
		
		for(int num : arr) {
			if(stack.peek() != num) {
				stack.push(num); 
			}
		}
		
		int[] answer = new int[stack.size()];
		
		// [1,3,0,1] 이라는 데이터가 있을때, 길이는 4, 인덱스는 0 ~ 3
		for(int i = answer.length-1; i>=0; i--) {
			answer[i] = stack.pop();
		}
		
		return answer; 
	}
}
