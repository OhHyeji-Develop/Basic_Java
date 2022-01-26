package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (기본형(하나의 값 저장) -> 배열(여러개의 값 저장, 단점-타입이 같아야한다) -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 * - 개념을 이해하는게 중요, 책 읽어보기
		*/
		
		// 기본형 변수
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		
		// 배열
		int[] scores;
		int sum2;
		double avg2;
		
		
		// 만든 Student클래스 사용
		Student student = new Student(); // 객체생성(인스턴스화) - Student클래스를 사용할 수 있게 하는 객체 생성
		// 클래스의 이름이 타입이 되고 뒤에 이름을 student로 지음
		student.kor = (int)(Math.random() * 101); // 클래스명을 앞에 전부 적어줘야함
		student.eng = (int)(Math.random() * 101);
		student.math = (int)(Math.random() * 101);
		student.sum = student.kor + student.eng + student.math;
		student.avg = Math.round(student.sum / 3.0 * 100) / 100.0;
		
		System.out.println("합계 : " + student.sum);
		System.out.println("평균 : " + student.avg);

	}

}

class Student{ // 이 클래스를 사용하기 위해서는 객체생성을 해야함 (사용할 수 있게 메모리에 올려놓는 작업) / 클래스(설계도),객체(물건)
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
}
 