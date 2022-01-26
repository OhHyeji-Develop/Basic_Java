package e_oop.score;

public class Score {

	public static void main(String[] args) {
	
		String[] studentNames = {"김기웅","박태정","이정규","오지현"}; // ->학생의 이름, 배열의 길이 4
		Student[] students = new Student[studentNames.length]; //Student타입의 students를 저장할 studentNames길이의 배열
		
		for(int i = 0; i < students.length; i++) { // 배열의 길이만큼 for문이 돌면서 학생이 만들어지고 저장됨
			students[i] = new Student(); // 객체 생성하고 배열에 저장
			// new 클래스(); -> 클래스로부터 객체생성
			// 클래스 변수 = new 클래스(); -> new연산자로 객체 생성, 리턴된 객체의 번지를 변수에 저장
			
			students[i].name = studentNames[i];
			students[i].kor = (int)(Math.random() * 101);
			students[i].eng = (int)(Math.random() * 101);
			students[i].math = (int)(Math.random() * 101);
			students[i].rank = 1;
			
		}
		
		//합계와 평균
		for(int i = 0; i < students.length; i++) {
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round((double)students[i].sum / students.length * 100) / 100.0;
		}
		
		// 석차 구하기
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(students[i].sum<students[j].sum) {
					students[i].rank++;
				}
			}
		}
		
		// 정렬
		for(int i = 0; i < students.length; i++) {
			int min = i;
			for(int j = 0; j < students.length; j++) {
				if(students[j].rank<students[min].rank) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp; // 객체 자체의 자리를 바꿈
		}
		
		// 과목별 합계
		int[] sums = new int [3]; // 과목별 합계를 저장할 배열
		for(int i = 0; i < sums.length; i++) { // 학생의 수만큼 for 문을 돈다
			sums[0] += students[i].kor;
			sums[1] += students[i].eng;
			sums[2] += students[i].math;
		}
		
		// 과목별 평균
		double[] avgs = new double[3];
		for(int i = 0; i < avgs.length; i++) {
			avgs[i] = Math.round((double)sums[i] / students.length + 100) / 100.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + "\t" 
								+ students[i].kor + "\t" 
								+ students[i].eng + "\t" 
								+ students[i].math + "\t" 
								+ students[i].sum + "\t" 
								+ students[i].avg + "\t" 
								+ students[i].rank);
		}

		System.out.println("과목합계");
		for(int i = 0; i < sums.length; i++) {
			System.out.print("\t" + sums[i]);
		}

		System.out.println();

		System.out.println("과목평균");
		for (int i = 0; i < avgs.length; i++) {
			System.out.print("\t" + avgs[i]);
		}

	}

}
