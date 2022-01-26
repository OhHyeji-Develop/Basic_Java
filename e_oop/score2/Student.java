package e_oop.score2;


public class Student {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;

	void random() { // 점수를 랜덤으로 발생하는 메서드
		kor = (int)(Math.random()* 101);
		eng = (int)(Math.random()* 101);
		math= (int)(Math.random()* 101);
	}
	// 한개의 메서드에는 한가지 일만 실행하는것이 중요
	int getSum() { // 합계
		return sum = kor + eng + math;
	}
	
	double getAvg() { // 평균
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0 ;
	}
	
	int getRank(Student[] students) { // 학생들의 정보를 파라미터로 받음
		rank = 1;
		
		for(int  i = 0; i < students.length; i++) {
			if(getSum() < students[i].getSum()) { // 학생들의 합계와 내 합계를 비교해서 석차를 구함
				rank++;
			}
		}
		return rank;
	}
	
	String getInfo() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}

	
}
	// student 학생클래스에 메서드가 생기는건 학생이 할 수 있는 일을 만드는것 (국어, 영어,수학의 합계와 평균 구하는것
	// 해당 클래스는 한명의 학생의 것
	
	// 메서드 밖에 있는 변수(전역변수, 모든 메서드와 클래스 전체에서 사용가능, 초기화 하지 않아도 기본값으로 자동으로 초기화됨)와 
	// 안에있는 변수(지역변수, 메서드 안에서만 사용 가능, 자동으로 초기화X -> 반드시 값을 넣어서 초기화를 해줘야함)는 차이가 있다.

