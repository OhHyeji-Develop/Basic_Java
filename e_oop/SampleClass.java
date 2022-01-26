package e_oop;

public class SampleClass {
	
	/*
	 * - 메서드 : 변수를 가지고 할 일
	 * - 선언 방법 : 리턴타입 메서드명(파라미터) { }
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	 */
	
	String method(int parameter , String str) { 
		// 맨앞은 리턴타입(돌려주는 값의 타입, 여기서는 String타입의 값을 돌려줌) // ( )안에는 변수를 넣어줌, 여러개의 변수를 만들때는 ( , )
		return parameter + "/" + str + " 를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
	}
	
	void method2() { //리턴타입도 필요없고 파라미터도 필요없을때는 void(=비어있다)를 적어준다
		System.out.println("파라미터도 리턴타입도 없는 메서트");
	}
	
	// 메서드 출력 순서맞추기
	void flowTest1() {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}
	
	void flowTest2() {
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}
	
	void flowTest3() {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
	
	
	
	

}
