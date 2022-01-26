package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산 : +=, -=, *=, /=, %=
		 * - 증감연산 (변수에 들어있는값을 1만큼 증가 or 감소) : ++, --
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		result = 10 / 3; 
		System.out.println(result);
		//int타입은 소수점을 얻을수 없음
		result = 10 % 3; //10을 3으로 나누 나머지를 구함
		System.out.println(result); //어떤 수가 홀수인지 짝수인지 알고싶을 때 사용
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		
		result = 1 + 2;
		System.out.println(result);
		result = 3 - 2;
		System.out.println(result);
		result = 1 * 2;
		System.out.println(result);
		result = 8 / 4;
		System.out.println(result);
		result = 51 % 10;
		System.out.println(result);
		
		//복합연산
		result = result + 3;
		
		result += 3;
		
		result -= 5;
		
		result *= 2;
		
		result /= 3 + 2; //복합연산자를 기준으로 오른쪽에 연산이 있으면 오른쪽연산 먼저 실행 후 복합연산 실행
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		//result = result % 5;
		result %= 5;
		//result = result - 2 * 3;
		result -= 2 * 3;
		
		//증감연산
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산다(--) : 변수의 값을 1 감소시킨다.
		
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가한다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		// 산술연산자 사용시 주의점
		// 피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //다른타입의 연산인 경우 작은타입이 큰타입으로 형변환
		//double result2 =(double) _int + _double; 더블타입으로 형변환
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //컴퓨터는 최소 4바이트부터 연산가능 (1,2바이트는 연산 안함), 
		//_int = (int)_byte + (int)_short; (int보다 작은 타입은 int로 형변환이 됨)
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2; //char - 2바이트라서 int타입으로 형변환됨
		System.out.println(_int);
		
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		//byte ( -127~127)
		//127을 벗어나서 실행하면 가장 작은 숫자가 출력됨
		
		byte b = 127;
		b++;
		System.out.println();
		b--;
		System.out.println();
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long res = 123456 + 654321;
		res *= 123456;
		res /= 123456;
		res-= 654321;
		res %=123456;
		System.out.println(res);
		
		//3개의 int타입 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0; 
		System.out.println(sum + "/" +avg);
		
		
		//반올림
//		avg = Math.round(avg); //무조건 소수점 첫째자리에서 반올림해준다.
//		System.out.println(avg);
		
		avg = Math.round(avg * 10) / 10.0;
		System.out.println(avg);
		
		//랜덤 : Math.random() - 0.0 ~ 1.0미만 (자주 사용)
		int random = (int)(Math.random() * 100) + 1;
		System.out.println(random);
		
		
		

		
	}

}
