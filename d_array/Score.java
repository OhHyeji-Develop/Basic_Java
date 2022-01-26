package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		
		/*
		 *  우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Jave 점수를
		 *  0~100사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요.
		 *  25명의 7과목 점수
		 *  
		 *  
		 *  scores[3][7]; -> 1차원 배열 길이3, 2차원 배열 길이7
		 *  
		 *  이름		국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차
		 *  홍길동	90		90		90		90		90		  90		90			630		90.00	1
		 *  홍길동	90		90		90		90		90		  90		90			630		90.00	1
		 *  홍길동	90		90		90		90		90		  90		90			630		90.00	1
		 *  과목합계  180		180		180		180		180		  180		180
		 *  과목평균	90.00	90.00	90.00	90.00	90.00	  90.00	    90.00
		 *  
		*/
		
		int[][]scores = new int[5][7];
		String[] subject = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"}; // 과목
		String[] name = {"김철수", "오혜지", "이유리","곽도원","배성준"}; //이름
		int[] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		int[] rank = new int[scores.length]; //석차
		int[] sum1 = new int[scores.length]; //과목합계
		
		


		System.out.print("이름");
		for(int i = 0; i < subject.length; i++) {
			System.out.print("\t" + subject[i]);
		}
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				
				scores[i][j] = (int) (Math.random() * 100) + 1;

					
				sum[i] += scores[i][j];

				sum1[i] += scores[0][j];

				avg[i] = (double) sum[i] / scores[i].length;

				rank[i] = 1;
				
//				if (scores[i][j] < scores[i][j + 1]) {
//					rank[i]++;
//
//				}
			}
				System.out.println(name[i] + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t"
						+ scores[i][3] + "\t" + scores[i][4] + "\t" + scores[i][5] + "\t" + scores[i][6] + "\t" + sum[i]
						+ "\t" + avg[i] + rank[i]);

			

		}

	}
}
