package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		/*
		 * - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 		높은 점수를 만날때마다 등수가 정해짐. 
		 *      석차를 저장할 배열에 1을 다 저장. for문을 2개만들어서 전체를 비교
		 *      더 작은 점수의 등수를 증가시킴
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 배열에서 가장 작은 숫자를 찾고 0번 인덱스로 보냄, 원래 0번인덱스에 있던숫자와 자리 바꿈.
		 * 그 다음에 작은 숫자를 찾고 1번 인덱스로 보냄, 
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식	
		 *  두번째부터 시작, 앞에 있는 숫자와 비교
		 */

		 
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("랜덤배열 : " + Arrays.toString(arr));
		
//-----------------------------------------------------------------------------------------
//		//석차구하기
//		int[] rank = new int[arr.length]; //석차를 넣을 배열
//		for(int i = 0; i < rank.length; i++) {
//			rank[i] = 1;
//		}
//		
//		for(int i = 0; i < arr.length; i++) { //밖에 for문이 1번 실행될때 안쪽 for문은 10번 실행
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(rank));
//		
//-----------------------------------------------------------------------------------------	
//		- 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
//		   배열에서 가장 작은 숫자를 찾고 0번 인덱스로 보냄, 원래 0번인덱스에 있던숫자와 자리 바꿈.
//		   그 다음에 작은 숫자를 찾고 1번 인덱스로 보냄.
		
		
		for(int i = 0; i < arr.length - 1; i++) { // 불필요한 정렬을 안하기 위해서 -1을 해줌 arr.length의 길이 10 - 1 = 9
			int min = i; // min이라는 변수를 만들고 i로 초기화
			for(int j = i + 1; j < arr.length; j++) { // 제일 앞 값을 다른 값과 비교하는 for문
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			//해당 최소값을 데이터 맨 앞에 위치한 값과 교체
			int temp = arr[i]; //가장 작은값 옮기기
			arr[i] = arr[min]; 
			arr[min] = temp;   
		}
	System.out.println("선택정렬 : " + Arrays.toString(arr));
		
//-----------------------------------------------------------------------------------------
//		* - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		
		for(int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for(int j = 0 ; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
				
			}
			if(!flag) {
				break;
			}
	}
		System.out.println(Arrays.toString(arr));
		
//-----------------------------------------------------------------------------------------	
//		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식	
//		 *   		 두번째부터 시작, 앞에 있는 숫자와 비교
		
//		1,0
//		2,1 2,0
//		3,2 3,1 3,0
//		4,3 4,2 4,1 4,0
//		5,4 5,3 5,2 5,1 5,0
//		6,5 6,4 6,3 6,2 6,1 6,0
//		7,6 7,5 7,4 7,3 7,2 7,1 7,0
//		8,7 8,6 8,5 8,4 8,3 8,2 8,1 8,0
//		9,8 9,7 9,6 9,5 9,4 9,3 9,2 9,1 9,0
		
		//i는 증가하고 j(i보다 1작은 값에서 0이 됨)는 감소
		
		for(int i = 1; i <arr.length; i++) {
			int temp = arr[i]; //i값이 없어 질수 있으니 따로 보관
			int j = 0;
			for(j = i - 1; j >= 0; j--) {
				if(temp < arr[j]) {
					arr[j + 1] = arr[j];
				}else {
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
}
