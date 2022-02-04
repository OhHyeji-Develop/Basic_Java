package j_collection;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		// Q. list에 1~100사이의 랜덤값 10개 저장해주세요
		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 100) + 1;
			list.add(random);
		}
		System.out.println(list);

		// Q. list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		avg = (double) sum / list.size();
		System.out.println("합계 : " + sum + "/ 평균 : " + avg);

		// Q. list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println("최소값 : " + min + "/ 최대값 : " + max);

		// Q. list를 오름차순으로 정렬해주세요(이해X)★☆★☆★☆★☆★☆
		for (int i = 0; i < list.size() - 1; i++) {
			min = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(min) > list.get(j)) {
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i,list.get(min));
			list.set(min, temp);
			
//			list.set(min, null)
		}
		System.out.println("오름차순 : " + list);

	}

}
