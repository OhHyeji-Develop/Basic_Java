package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier{
	

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier(); // 객체생성
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar); //AccessModifier를 통해서 접근하는것이기때문에 실행X
//		am.protectedMethod();
		
		AccessTest at = new AccessTest(); //AccessTest의 객체를 만들어줘야함
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
//		System.out.println(am.privateVar); -> 다른클래스로 넘어오면 private는 사용할 수 없음
//		am.privateMethod();
		
	
		
		

	}

}
