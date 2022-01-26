package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		
		/*
		 * 비교연산자
		 * - <, >, <= (작거나 같다), >=, == (같다), != (다르다)
		 * - 문자열 비교 : equals() (문자열의 내용비교)
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = x < y;
		System.out.println(b);
		b = x <= y - 15; // 비교연산자와 산술연산자 중 산술연산자가 우선순위
		
		String str1 = "abc";
		String str2 = "ABC";
		
		b = str1 == str2; //실수 많이 하는 부분
		System.out.println(b); //f
		
		b = str1.equals(str2);
		System.out.println(b); //f
		
		b = !str1.equals(str2); //앞에 !를 붙히면 같지않다와 같은 표현
		System.out.println(b); //t
		
		// 다음의 문장들을 코드로 작성해주세요.
		//x는 y보다 작거나 같다. [x <= y; 이렇게 하면 컴파일 에러발생]
		b = x <= y;
		//x + 5와 y는 같다.
		b = x + 5 == y;
		//y는 홀수이다.
		b = y % 2 == 1;
		//"기본형"과 "참조형"은 다르다
		b = !"기본형".equals("참조형");

	}

}
