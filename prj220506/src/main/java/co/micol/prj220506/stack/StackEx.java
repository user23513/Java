package co.micol.prj220506.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackEx {
	
	private int[] arr = new int[10];
	private int top = 0;
	
	
	//top값이 0일때 숫자 저장
	//top값이 10보다 클때 숫자저장 못함.
	public void push(int n) {
		if(top == arr.length) {
			System.out.println("스택이 모두 찼습니다.");
		}else {
			arr[top] = n;
			top++;
		}
	}
		
	
	
	public void pop() {
		if(top<0) {
			System.out.println("스택이 비어있습니다.");
		}else {
			
		}
	}
	

}
