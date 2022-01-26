package d_array;

public class scoreExam {

	public static void main(String[] args) {
		
		// 배열 생성
		String[] names = {"강동주", "강정인", "강현수", "곽성상", "김기웅"
						, "김민지", "김형돈", "노혜지", "박태정", "서난희"
						, "예현의", "오지현", "오혜지", "유정민", "이병진"
						, "이수민", "이슬기", "이유정", "이의찬", "이정규"
						, "이종민", "장문석", "정다영", "최민규", "최혁진"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		int[][] score = new int [names.length][subjects.length];
		
		// 랜덤 점수 발생
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = (int)(Math.random() * 101);
			}
		}
		
		// 개인 합계와 평균
		int[] nameSum = new int [score.length];
		double[] nameAvg = new double [score.length];
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;
		}
		
		// 과목별 합계와 평균
		int[] subSum = new int [subjects.length];
		double[] subAvg = new double [subjects.length];
		for(int i = 0; i < subjects.length; i++) {
			for(int j = 0; j < score.length; j++) {
				subSum[i] += score[j][i];
			}
			subAvg[i] = Math.round((double)subSum[i] / score.length * 100) / 100.0;
		}
		
		//석차 구하기
		int[] rank = new int [score.length];
		for(int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < score.length; j++) {
				if(nameSum[i]<nameSum[j])
					rank[i]++;
			}
		}
		
		// 출력
		System.out.print("이름");
		for(int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		
		System.out.println("\t합계\t평균\t석차");
		for(int i = 0; i < score.length; i++) {
			System.out.print("names[i]" + "\t");
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		System.out.print("과목합계\t");
		for(int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균\t");

	}

}
