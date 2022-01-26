package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * 예외 발생시키기
		 *  - throw new Exception();
		 */
		
		try {
			throw new IOException(); // 예외클래스의 객체 생성을 하면 에러발생
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		NullPointerException : 자주 발생하는 에러
//		
//		String str = null; // null값이 저장됨 -> String 객체가 만들어지지않음
//		
//		System.out.println(str.equals("abc")); // str을 호출할 수 있지만 실행되지않음
		
//		ArrayIndexOutOfBoundsException : 배열이 index의 범위를 벗어났다는 뜻
		int[] arr = new int[10];
		
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
