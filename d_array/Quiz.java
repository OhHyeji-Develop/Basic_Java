package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
//		1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
//		[3,1,2,1,3,5,1,3,4,2]
//		[3,1,2,5,4] 값이 들어있는 순서를 바꾸면 X
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) { //10번 반복하는 for문
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		
		System.out.println(Arrays.toString(arr)); // 배열 출력
		
		int[] temp = new int[5]; // 길이 5의 temp배열 생성
		int count = 0; // 현재 몇개를 저장했는지 카운트를 세기위해서 변수저장
		for(int i = 0; i < arr.length; i++) { // arr배열길이만큼 for문 반복
			boolean flag = true; // flag가 true
			for(int j = 0; j < temp.length; j++) { // temp배열길이면큼 for문 반복
				if(arr[i] == temp[j]) { // 만약에 arr[i]와 temp[j]가 같다면
					flag = false; // flag는 false
				}
			}
			if(flag) {
				temp[count++] = arr[i]; // temp
			}
		}
		
		System.out.println(Arrays.toString(temp)); //중복되지않은 값이 나오는 배열 출력
		
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result)); //나오지않은 값은 배열에 안나오게 출력
		

		//--------------------------------------------------------------

//		1~5사이의 숫자가 발생된 횟수만큼 *을 사용해 그래프를 그려주세요. (오류)
//		1 : *** 3
//		2 : **** 4
//		3 : ** 2
//		4 : ***** 5
//		5 : ****** 6
		
//		int[] arr = new int[20];
//
//		for(int i = 0; i < arr.length; i++) { // arr.length만큼 i를 반복
//			arr[i] = (int)(Math.random() * 5) + 1;	// arr[i]는 1부터 5까지의 랜덤 값
//		}
//		System.out.println(Arrays.toString(arr));  //배열arr출력
//		
//		int[] count = new int[5];  // 5자리의 count 배열 생성
		
//		for(int i = 0; i < arr.length; i++) {	// arr.length만큼 i를 반복
//			count[arr[i] - 1]++;	// arr[i]가 1이면 1 - 1 = count가 1씩 증가
//		}
//		System.out.println(Arrays.toString(count)); // count배열 출력
		
//		for(int i = 0; i < count.length; i++) {		count.length만큼 i를 반복
//			System.out.println(i + 1 + " : ");
		
//			for(int j = 0; j < count[i]; j++) {
//				System.out.println("*");
//			}
//			System.out.println(" " + count[i]);
//		}
		
		System.out.println("--------------------------------------");
		/*	
		 *  거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 *  거스름돈에 몇개의 동전이 필요한가
		 *  
		 *  거스름돈 : 2860원 
		 *  500원 : 5개
		 *  100원 : 3개
		 *  50원 : 1개
		 *  10원 : 1개
		 * 
		 */
		
		
		int money = (int)(Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10};
		System.out.println("거스름돈 : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원 : " + money / coin[i]);
			money %= coin[i];
			
			}

		}

	}


