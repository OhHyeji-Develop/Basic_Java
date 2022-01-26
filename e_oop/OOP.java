package e_oop;

public class OOP {

	public static void main(String[] args) {
		
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
		SampleClass sc = new SampleClass(); // 객체생성하고 저장
		
		String returnString =  sc.method(5, "ABC");
		System.out.println(returnString);
		
		sc.method2(); 
		
		sc.flowTest1();
		
		Calculator c = new Calculator();
		double result = c.add(123456, 654321);
		result = c.muiti(result, 123456);
		result = c.devide(result, 123456);
		result = c.sub(result, 654321);
		result = c.mod(result, 123456);
		System.out.println(result);
		

	}

}
