package e_oop.score2;

public class score2 {

	public static void main(String[] args) {

		String[] studentNames = {"김기웅","박태정","이정규","오지현"};
		Student[] students = new Student[studentNames.length];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].name = studentNames[i];
			students[i].random();
			students[i].getSum();
			students[i].getAvg();
		}
		
		for (int i = 0; i < students.length; i++) {
			students[i].getRank(students);
		}
		
		for(int i = 0; i < students.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < students.length; j++) {
				if(students[j].rank < students[min].rank) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
//			students[min] = Student temp;
		}

		int[] subSum = new int[3];
		for(int i = 0; i < students.length; i++) {
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		
		double[] subAvg = new double[3];
		for(int i = 0; i < subAvg.length; i++) {
			subAvg[i] = Math.round((double)subSum[i] / students.length * 100) / 100.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getInfo());
		}
		System.out.println("과목합계");
		for(int i = 0; i < subSum.length; i++) {
			System.out.println("\t" + subSum[i]);
		}
		System.out.println("\n과목평균");
		for(int i = 0; i < subAvg.length; i++) {
			System.out.println("\t" + subAvg[i]);
		}
	}

}
