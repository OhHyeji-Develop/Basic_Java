package e_oop;

public class ClassMaker {
	
	/*
	 *  메서드 만드는 연습
	*/
	
	// 전역변수 하나를 선언 및 초기화 해주세요.
	int num = 10;
	
	// 리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
	void a() {
		System.out.println(num);
	}
	
	// 전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	// 메서드 안에서 전역변수를 리턴해주세요
	int b() {
		return num;
	}
	
	// 리턴 타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요.
	void c(String s) {
		
//		if(s.equals("")) {  ---- ?
//			return;
//		}
		System.out.println(s);
		return; // -> 메서드를 종료시키는 역할, 리턴타입이 없어서 값은 넣어주는거 아님
	}
	
	// int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
	// 메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int d(int a, int b) {
		return a * b;
	}
	
}

// 리턴 :  뒤에 있는 값을 돌려주는 역할 or 메서드를 종료시키는 역할