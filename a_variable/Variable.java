package a_variable; // 패키지 : 클래스의 위치를 알려줌

import java.util.Scanner;
//import 단축키 : ctrl + shift + o

public class Variable { // 클래스 : 자바 프로그램의 구성요소 (하나의 데이터)

	public static void main(String[] args) { // 메서드 : 명령문의 집합
		//주석 : 프로그램 코드로 인식하지 않는 문장 (코드설명) ctrl + shift + C
		/* 범위 주석 (블럭으로 지정) : ctrl + sfift + / (해제할때는 \) */ 
	
		int x; //변수의 형태
		x = 10; //오른쪽 값을 왼쪽 변수에 저장
		int y = 20; //변수를 만듦과 동시에 값을 저장
		
		
		/*
		 * - ctrl + N : 새로만들기
		 * - ctrl + F11 : RUN
		 * 
		 * 기본형 타입 
		 * - 정수 : byte(1), short(2), *int(4), long(8) 
		 * - 실수 : float(4) -7자리, *double(8) -15자리
		 * - 문자 : char(2) 
		 * - 논리 : boolean(1)
		 * 
		 * 참조형 타입 (주소를 저장, 주소를 참조해서 들어가야함)
		 * - 문자열 : String(4) -> 여러글자를 표현하기위해 사용
		 * 
		 * 명명규칙 
		 * - 영문자 대소문자, 한글, 숫자, 특수문자(_, $)를 사용할 수 있다. 
		 * - 숫자로 시작할 수 없다 
		 * - 예약어는 사용할 수 없다. 
		 * - [캐멀케이스 = 낙타식 표기법을 사용한다.(mySamplevariable)] 
		 * - [클래스명만 첫 글자는 대문자로한다.(MySampleClass)]
		 */
		
		
		long a = 30000000L;  // 접미사L을 붙여야 long타입이 된다.
		float b = 3.14f; // 접미사F 붙여야 float타입이 된다.
		char c = '가'; // 자바에서 문자를 표현할때는 ''를 쓰고 그 안에 한 글자만 넣을 수 있음
		boolean d = true; //true 아니면 false 만 저장
		String e = "가나다라"; // String은 " "로 문자열을 표현
		
		//9가지 타입을 모두 사용해 9개의 변수를 선언 및 초기화(변수의 값 저장) 해주세요.
		
		byte f = 1;
		short g = 10;
		int h = 365;
		long i = 123456L;
		float j = 1.1f;
		double k = 678.910;
		char l = '가';
		boolean m = false;
		String n = "안녕하세요";
		
		// 형변환(데이터 타입을 다른 타입으로 변환하는 것)
		// 강제타입변환 : 큰 크기의 데이터 타입 -> 작은 크기의 데이터 타입 / 작은 쪽 변수 = (작은 쪽 데이터)큰 쪽 변수
		// 자동타입변환 : 작은 크기의 데이터 타입 -> 큰 크기의 데이터 타입
		int _int = 10;
		long _long = 20L;
		
		_int = (int)_long;
		_long = _int; // 표현범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다.
		
		//변수 3개를 선언해 변수의 타입과 다른 타입의 값으로 초기화 해주세요.
		short _short = 50;
		float _float = 34f;
		double _double = 999;
		
		_short = (short)_float;
		_float = (float)_double;
		_double = _short; //생략해도 가능

				
		
		_long = (long)_float;
		
		char _char = ' ';
		_int = _char;
		_char = (char)_int;
		
//---------------------------------------
		
		// (콘솔창에) 출력
		System.out.print("출력"); //소괄호가 붙으면 무조건 메서드
		System.out.println("출력 후 줄바꿈");
		System.out.printf("출력 포맷 지정");
		//실행 단축키 : ctrl + F11
		
		//탈출 문자
		System.out.println();
		System.out.println("탭은\t4칸에 맞춰 띄워줍니다.");
		System.out.println("줄바꿈을\n해줍니다."); // 줄바꿈 = \n
		System.out.println("\"쌍따옴표를 넣어줍니다.\""); // 쌍따옴표 표시 = \"
		System.out.println("\\역슬래시를 넣어줍니다."); //역슬래시 표시 = \\
		
//---------------------------------------
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		//Scanner객체를 생성하면 자동으로 util 패키지가 추가됨
		
		System.out.println("아무 문자열이나 입력해주세요.");
		String str = sc.nextLine(); //sc.nextLine() 는 문자열을 입력받음
		System.out.println("입력받은 내용 : " + str);
		
		System.out.print("숫자를 입력해주세요>");
		int nextInt = sc.nextInt();
		System.out.println("입력받은 숫자 : " + nextInt);
		
		
		System.out.println("문자열 입력>");
		String strr  = sc.nextLine();
		System.out.println("입력받은 문자열 : " + strr);
		System.out.println("입력 끝!");
		
		System.out.print("숫자 입력>");
		int num = Integer.parseInt(sc.nextLine()); //숫자를 입력받기 위한 방법
		System.out.println("입력받은 숫자 : " + num);
		
		
		//자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 변수에 이름을 저장해주세요.
		System.out.print("이름>");
		String myName = sc.nextLine();
		
		//자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 변수에 나이를 저장해주세요.
		System.out.print("나이>");
		int myAge = Integer.parseInt(sc.nextLine());
		
		//이름과 나이를 출력해주세요.
		System.out.println("이름 : " + myName + " / 나이 : " + myAge);
		
		
		
		
		
	}
	
}
