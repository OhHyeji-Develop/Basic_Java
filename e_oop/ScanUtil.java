package e_oop;

import java.util.Scanner;

public class ScanUtil {
	
	private static Scanner s = new Scanner(System.in); // 전역변수로 scanner를 만듦
	
	public static String nextLine() {
		return s.nextLine();
		}
	public static int nextInt() {
		int input = 0;
		
		try {
			input = Integer.parseInt(s.nextLine()); // 오류가 발생할 수 있는 부분
		}catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.>");
			input = nextInt(); // 재귀호출 : 자기자신을 호출
		}
		
		return input;
	}

}
