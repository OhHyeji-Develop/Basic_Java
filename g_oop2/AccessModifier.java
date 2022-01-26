package g_oop2;


public class AccessModifier { // 접근제어자 4개 외우기(접근범위, 허용범위)
	
	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar // 같은패키지에서 접근가능, 다른패키지에서는 상속받으면 접근 가능
		= "protected : 같은 패키지 +  상속받은 클래스에서 접근 가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능"; // 접근제어자 없음(생략하면 default)
	private String privateVar = "private : 클래서 내에서만 접근 가능";
	
	public void publicMethod() {
		System.out.println(publicVar);
	}
	protected void protectedMethod() {
		System.out.println(protectedVar);
	}
	void defaultMethod() {
		System.out.println(defaultVar);
	}
	private void privateMethod() {
		System.out.println(privateVar);
	}
	
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier(); // 객체생성
		
		System.out.println(am.publicVar);
		am.privateMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		
		/*
		 * 접근 제어자를 사용하는 이유
		 *  - 데이터를 보호하기 위해
		 *  - 사용하는데 불필요한 멤버를 숨기기 위해
		 */
		
		
		Time t = new Time();
		
//		t.hour = 14;
//		t.minute = 9;
//		t.second = 99;
		
		t.setHour(8);
		t.setMinute(9);
		t.setSecond(-7);
		System.out.println(t);
		
		t.clock();
		
	}

}
