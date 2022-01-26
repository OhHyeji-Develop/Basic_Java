package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		
		/*
		 * 비트 연산자 (잘 사용하지 않음)
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다. 
		 * 
		 * 기타 연산자
		 * - . (참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다. 
		 * 클래스에는 변수와 메서드로 구성, 클래스안에 포함되어있는 변수나 메서드를 지칭할 때 . (참조연산자)사용
		 * - ?:(삼항연산자) : 조건식? 조건식이 참일 경우 수행할 문장
		 * 						: 조건식이 거짓일 경우 수행할 문장
		 * 조건식을 확인해서 true면 두번째, false면 세번째 문장 사용
		 */

		//1byte : 01010101
		System.out.println(10 | 15);
		//10 : 00001010 (십진수 -> 이진수)
		//15 : 00001111
		//     00001111
		
		
		int x = 10;
		int y = 20;
		
		int result = x < y ? x : y; // x < y -> true라서 x가 실행됨 -> int result = x;
		System.out.println(result);
		
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 5;
		String gender = regNo == 1 ? "남자" : "여자"; 
		//남자만 확인가능
		System.out.println(gender);
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가"); 
		//?(삼항연산자)를 중첩해서 사용해야 남자여자 확인가능
		System.out.println(gender);
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자>");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자>");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println(num1 > num2 ? num1 : num2);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인 불가를 출력해주세요.
		
		System.out.print("숫자>");
		int num = Integer.parseInt(sc.nextLine());
		gender = num == 1 || num == 3 ? "남자" :
			(num == 2 || num == 4 ? "여자" : "확인불가" );
		System.out.println(gender);
		
		//논리연산자는 양쪽에 불린타입을 넣어야한다.
		//num == 1 || 3 (X)
	}

}
