package �˰���_�����_ŰƮ.����_ť.�������ڴ½Ⱦ�;

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
		
		// [1,3,0,1] �̶�� �����Ͱ� ������, ���̴� 4, �ε����� 0 ~ 3
		for(int i = answer.length-1; i>=0; i--) {
			answer[i] = stack.pop();
		}
		
		return answer; 
	}
}
