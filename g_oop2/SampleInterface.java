package g_oop2;

public interface SampleInterface {
	
	// 인터페이스(부모의 역할, 객체생성X, 상속의 역할) : 상수와 추상메서드만 가질수 있는 데이터
	// 일반적인 변수나 메서드는 가질 수 없음
	
	// 인터페이스의 모든 멤버변수는  public static final(->상수) 제어자를 사용해야한다.
	public static final int NUM1 = 1;
	
	// 모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 1;
	
	// 인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	// 모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();

}

//인터페이스를 상속받기 위한 클래스
class SampleImplement implements SampleInterface,SampleInterface2 { //인터페이스를 상속받을 때는 implements 사용
// 인터페이스는 다중상속이 가능 : 추상메서드는 내용이 없기 때문에 다중상속이 가능

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {

	}

	@Override
	public void method3() {
		
	}
	
}

interface SampleInterface2{
	void method1();
	void method3();
}