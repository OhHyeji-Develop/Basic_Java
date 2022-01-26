package g_oop2;

public class SampleChild extends SampleParent{ // 상속받기
	
	void childMethod() {
		// 상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); // 상속받은 변수
		System.out.println(method(7, 13)); // 상속받은 메서드
	}
	
	// 오버라이딩
	// - 상속받은 메서드의 내용을 바꾸는것
	
	// super, super()
	// super : 부모클래스의 멤버와 자식클래스의 멤버 이름이 똑같을때 구분해주기 위해 사용
	// super() : 자식클래스의 생성자에서 부모클래스의 생성자를 호출할 때 사용, 생성자 안에서만 사용가능
	
	// 다형성 (다양한 형태의 성질)
	// 부모타입의 변수로 자식타입의 객체를 사용하는 것
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것
	// 선언하는 부분은 똑같이 적고 내용만 바꾸는 것
	@Override // (@)어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것 (실수방지)
	int method(int a, int b) { // 리턴타입, 메서드명, 파라미터 모두 같아야함
		return a * b;
	}
	
	//super, super()
	int var;
	
	void test(double var) {
		System.out.println(var); // 지역변수
		System.out.println(this.var); // 인스턴스 변수
		System.out.println(super.var); // 부모클래스의 인스턴스 변수
		// super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될때 둘을 구분하기 위해 사용한다, 변수뿐만아니라 메서드가 같을때도 사용 가능
	}
	
	SampleChild(){
	//	this(); // 같은 생성자내에있는 다른 생성자 호출
		super(); // 부모클래스의 기본 생성자 호출
	// 둘다 생성자 안 가장 첫줄에서 사용해야한다. this와 super 동시 사용불가
	// this()가 없는 생성자에만 super를 호출한다.
	}
	
	
	// 다형성 : 부모타입의 변수로 자식타입의 객체를 사용하는 것
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		SampleParent sp = new SampleChild(); // 다형성
		// 변수(부모)의 타입에 있는 멤버만 사용할 수 있다.
		System.out.println(sp.var); // 부모타입의 변수
		sp.method(10, 20); // 부모타입의 메서드
		
		//객체(자식)의 타입에 있는 멤버는 사용할 수 없다.
//		sp.childMethod(); //  컴파일에러 발생
//		sp.test();		  //  사용 불가
	}

}
