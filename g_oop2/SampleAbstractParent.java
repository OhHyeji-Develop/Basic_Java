package g_oop2;

// 추상클래스
public abstract class SampleAbstractParent {

	void method() {
		
	}
	
	// 추상메서드 : 내용이 없는 메서드, 호출이 안됨
	// 추상메서드를 하나라도 가지고있으면 추상클래스가 됨
	// 추상메서드를 가지고있는 클래스도 객체생성을 못함
	// 앞에 abstract 제어자가 붙음
	// 부모로만 사용됨. 다른클래스가 상속받기 위해. 상속하는 용도로 사용됨
	// 상속받는 클래스들이 메서드는 같은데 내용이 다를때 추상메서드 사용
	abstract void abstractMethod(); // 아예 블럭자체가 X, ;으로 끝남
	
	
}

class SampleAbstractChile extends SampleAbstractParent{ //상속받을 자식클래스
	// 추상메서드를 상속받으면 무조건 오버라이딩을 해줘야함
	// 추상클래스는 추상메서드를 강제로 만들으라고 명령하는 역할

	@Override
	void abstractMethod() {
		
		
	} 
}
