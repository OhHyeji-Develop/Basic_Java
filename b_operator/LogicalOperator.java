package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {

		/*
		 * 논리 연산자
		 * - &&(AND)둘중 하나만 true면 false, ||(OR)둘중 하나라도 true면 true, !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		 
		boolean b = 0 < x && x < 10 || x < y; //&&와 !!중 &&가 먼저 실행됨 (&&가 뒤에있더라도 먼저 실행)
		//0 < x && x < 10 -> false
		//x < y; -> true
		//비교연산이 논리연산보다 우선순위 높음
		//(우선순위 높은순)산술연산>비교연산>논리연산
		
		b = !(x < y); //조건식의 결과를 반대로 저장한다.
		// !의 피연산자에 무조건 ()를 써야한다.
		
		//논리연산은 효율적 연산을 한다.
		
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
			
		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		
		int a = 10;
		b = a < 5 && 0 <a++; //a<5 ->false, 0<a++ -> ture &&로 이어져있기 때문에 false
		System.out.println(a);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		b = x > y && x < 10;
		//2. x가 짝수이고 y보다 작거나 같다.
		b = x % 2 == 0 && x <= y;
		//3. x가 3의 배수이거나 5의 배수이다.
		b = x % 3 == 0 || x % 5 == 0;

	}

}
