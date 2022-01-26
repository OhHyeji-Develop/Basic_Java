package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudent {

	public static void main(String[] args) {
	
//		  25칸짜리 문자열을 저장할 수 있는 배열을 만든다.
		
//		  그 안에 이름을 전부 저장한 후 그 중에서 랜덤으로 몇명을 뽑음
//		  몇명을 뽑을지는 사용자에게 입력을 받아서 뽑는다.
//		  (중복없이 뽑기)
		
		String[] students = {"김기웅","박태정","이정규","오지현"};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("몇명?");
		int count = Integer.parseInt(s.nextLine());
		
		String[] pick =  new String[count];
		int pickCount = 0;// 뽑힌 사람의 수를 세기위한 변수
		do {
			int random = (int)(Math.random() * students.length);
			
			
			boolean flag = true;
			for(int i = 0; i < pick.length; i++) {
				if(students[random].equals(pick[i])) { //랜덤이랑 이미 뽑힌 사람이랑 비교
					flag = false;
				}
			} 
			
			if(flag) { //flag값이 true일때
				pick[pickCount++] = students[random];
			}
			
		}while(pickCount < count);
		
		System.out.println(Arrays.toString(pick));
	
		
	
	}

}
