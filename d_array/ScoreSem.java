package d_array;

public class ScoreSem {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		String[] names = {"강동주", "강정인", "강현수", "곽성상", "김기웅"
						, "김민지", "김형돈", "노혜지", "박태정", "서난희"
						, "예현의", "오지현", "오혜지", "유정민", "이병진"
						, "이수민", "이슬기", "이유정", "이의찬", "이정규"
						, "이종민", "장문석", "정다영", "최민규", "최혁진"}; // 25개의 이름 배열 생성
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		int[][] score = new int[names.length][subjects.length]; //점수를 저장할 score[25][7] 배열생성
		
		//점수 랜덤 발생''''''''''''''''''''''''''''''''''''''''''''''''
		for(int i = 0; i < score.length; i++) { //i를 score.length(=25)번 1씩 증가하면서 반복
			for(int j = 0; j < score[i].length; j++) { // score[i].length = 7
				score[i][j] = (int)(Math.random()*101); // 모든 배열에 0~100까지의 랜덤값 부여
			}
		}
		
		// 개인 합계와 평균
		// 1. 개인 합계와 평균을 저장할 배열을 생성한다.
		int[] nameSum = new int[score.length]; // 과목 개인 합계를 넣을 배열
		double[] nameAvg = new double[score.length]; //과목 개인 평균을 넣을 배열
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;
			// 구해진 합계를 과목 수로 나눠서 평균 계산(반올림해서 소수점 둘째 자리까지 표현) 
		}
		
		//과목별 합계 평균
		int[] subSum = new int[subjects.length]; //왜 subjects.length가 들어가는걸까?
		double[] subAvg = new double[subjects.length];
		for(int i = 0; i < subjects.length; i++) {
			for(int j = 0; j < score.length; j++) { //왜 j를 score.length만큼 반복하는걸까?
				subSum[i] += score[j][i]; // 개인이 아닌 과목에 대한 계산이므로 인덱스 순서가 반대가 됨 
			}
			subAvg[i] = Math.round((double)subSum[i] / score.length * 100) / 100.0;
		}
		
		//석차  ★★★★★
		int[] rank = new int[score.length]; // 석차를 저장할 배열만들기
		for(int i = 0; i < score.length; i++) { // i를 25번반복
			rank[i] = 1; // 비교 전
			for(int j = 0; j < score.length; j++) { // ?
				if(nameSum[i] < nameSum[j]) {
					rank[i]++;
				}
			}
		}
		
		//석차순으로 정렬(시험에 출제되지 않음)
		for(int i = 0; i < rank.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < rank.length; j++) {
				if(rank[j] < rank[min]) {
					min = j;
				}
			}
			int[] temp = score[i];
			score[i] = score[min];
			score[min] = temp;
			
			int temp2 = nameSum[i];
			nameSum[i] = nameSum[min];
			nameSum[min] = temp2;
			
			double temp3 = nameAvg[i];
			nameAvg[i] = nameAvg[min];
			nameAvg[min] = temp3;
			
			int temp4 = rank[i];
			rank[i] = rank[min];
			rank[min] = temp4;
			
			String temp5 = names[i];
			names[i] = names[min];
			names[min] = temp5;
		}
		
		//출력
		System.out.print("이름"); // 이름옆으로 탭치고 과목명 출력
		for(int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		
		System.out.println("\t합계\t평균\t석차");
		
		for(int i = 0; i < score.length; i++) { // score.length 길이만큼 반복
			System.out.print(names[i] + "\t"); // 해당 이름만 출력
			
			for(int j = 0; j < score[i].length; j++) { //이름에 해당하는 점수를
				System.out.print(score[i][j] + "\t"); // 옆으로 출력
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		
		System.out.print("과목합계\t");
		for(int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();  // 줄바꿈
		System.out.print("과목평균\t");
		for(int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i] + "\t");
		}
		
		
	}

}









