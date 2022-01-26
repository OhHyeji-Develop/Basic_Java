package g_oop2;

public class AccessTest {

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier(); // 객체생성
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
//		System.out.println(am.privateVar); -> 다른클래스로 넘어오면 private는 사용할 수 없음
//		am.privateMethod();

	}

}
