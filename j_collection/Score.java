package j_collection;

import java.util.ArrayList;

import d_array.Array;

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
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("김기웅");
		students.add("박태정");
		students.add("이정규");
		students.add("오지현");
		students.add("최혁진");
		students.add("정다영");
		
		
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();
		ArrayList<Integer> ranks = new ArrayList<Integer>();
		ArrayList<Integer> subSums = new ArrayList<Integer>();
		ArrayList<Double> subAvgs = new ArrayList<Double>();
		
	
		//랜덤 점수 발생
		for(int i = 0; i < students.size(); i++) {
			scores.add(new ArrayList<Integer>());
			for(int j = 0; j < subjects.size(); j++) {
				scores.get(i).add((int)(Math.random() * 101));
			}
		}
		
		// 합계와 평균

		for(int i = 0; i < scores.size(); i++) {
			int sum = 0;
			for(int j= 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add((double)(Math.round(sum / scores.get(i).size())));
		}

		
		// 과목별 합계

		for(int i = 0; i < subjects.size(); i++) {
			int sum = 0;
			for(int j = 0; j < students.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add((double)(Math.round(sum / scores.get(i).size())));
		}

		
		// 석차
		
		for(int i = 0; i < sums.size(); i++) {
			ranks.add(1);
			for(int j = 0; j < sums.size(); j++) {
				if(sums.get(i) < sums.get(i)) {
					ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		for(int i = 0; i < ranks.size(); i++) {
			int min = i;
			for(int j = i + 1; j < ranks.size(); j++) {
				if(ranks.get(j) < ranks.get(min)) {
					min = j;
				}
			}
			
			students.set(i, students.set(min, students.get(i)));
			scores.set(i, scores.set(min, scores.get(min)));
			
		}

		
		System.out.print("이름"); // 이름옆으로 탭치고 과목명 출력
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		
		System.out.println("\t합계\t평균\t석차");
		
//		for(int i = 0; i < 25; i++) {
//			System.out.println(stu.get(i) + "\t");
//			for(int j = 0; j < 7; j++) {
//				System.out.println(score.get(i).get(j));
//			}
//		}
//		
//		
//		System.out.println("\t합계\t평균\t석차");
//		for(int i = 0; i < 25; i++) {
//			System.out.println(stu.get(i) + "\t");
//			
//			for(int j = 0; j < 7; j++) {
//				System.out.println(score.get(i).get(j) + "\t");
//			}
//		}
////		
//		for(int i = 0; i < score.size(); i++) { // score.length 길이만큼 반복
//			System.out.print(names[i] + "\t"); // 해당 이름만 출력
//			
//			for(int j = 0; j < score[i].length; j++) { //이름에 해당하는 점수를
//				System.out.print(score[i][j] + "\t"); // 옆으로 출력
//			}
//			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
//		}
//		
		

	}
}

