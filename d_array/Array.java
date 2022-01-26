package d_array;

import java.util.Arrays;

import javax.swing.text.html.MinimalHTMLWriter;

public class Array {

	public static void main(String[] args) {

		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입
		 * - 인덱스로 값을 구분한다. (인덱스는 0부터 시작)
		 * - 배열의 각 인덱스는 각 항목의 데이터를 읽거나 저장하는 데 사용, 배열 이름 옆에 []대괄호에 기입
		 * - 길이를 변경 할 수 없다.	
		 * - 같은 타입의 데이터만 저장 가능
		 */
		
		int[] array; 		//배열의 주소를 저장할 공간이 만들어진다. []는 타입뒤에 붙힐 수 있고 변수명 뒤에 붙힐 수 있음.
		array = new int[5]; //배열이 생성되고 그 주소가 저장됨. new int[5] -> 배열이 만들어지는 부분
		//int5개를 저장할 수 있는 공간이 생기고 그 주소가 변수에 저장됨
		//기본값이 저장된다.  array = new int[5]; ->기본값 5개가 저장됨
		
		/*	
		 * 변수 = 100번지(주소)
		 * 
		 * 100번지
		 * {0, 0, 0, 0, 0} 배열이 있고 5개의 int가 저장
		 * 
		 */
		
		array = new int[] {1, 2, 3, 4, 5}; //배열이 만들어 질때 5개의 값이 들어간 상태로 만들어짐
		//배열의 길이는 처음 들어간 값의 갯수로 정해짐 {1, 2, 3, 4, 5)의 배열길이는 5
		//이런식일때는 []안에 숫자를 넣으면 안됨
		
		//array = {1, 2, 3, 4, 5}; -> 이 방법은 반드시 변수의 선언과 초기화를 동시에 해줘야함
		
		int[] array2 = {1, 2, 3, 4, 5};
		
		//--------------배열에 값 저장---------------
		array[0] = 10; //0번인덱스 = 배열에 저장된 첫번째 값(순서가 0부터 시작)
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
	
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		for(int i = 0; i < array.length; i++) { //array.length -> 배열의 길이, 5를 적는것보다 더 좋은 코드
			array[i] = (i + 1) * 10;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//------------------------------------------------------------------		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1; 
		}
		System.out.println(Arrays.toString(arr)); //for문을 쓰지않고 배열출력
		//sysout + ctrl + 스페이스바 = System.out.println()
		
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		//합계와 평균을 저장할 변수를 만듦
		
		int sum = 0; //합계를 저장할 변수
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length; //둘중하나는 double이여야 소수점을 얻을수 있음
		System.out.println("총합 : " + sum + ", 평균 : " + avg);
		
		//------------------------------------------------------------------		
		//6개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		//배열의 모든 인덱스에 1~10사이의 랜덤한 값을 저장해주세요.
		int[] arr1 = new int [6];
		
		
		//------------------------------------------------------------------
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		//변수를 만들어서 값을 저장하고 더 큰값, 더 작은값을 비교
		
		//최소값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다.
		int min = arr[0];
		
		//최대값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다.
		int max = arr[0];
		
		//변수에 저장된 값과 배열의모든 인덱스의 값을 비교하기 위한 for문을 만든다.
		for(int i = 0; i < arr.length; i++) {
			//최소값이 저장된 변수와 배열의 값을 비교해서 더 작은 값을 찾으면 변수에 저장한다.
			if(min > arr[i]) {
				min = arr[i];
			
		}
		//최대값이 저장된 변수의 배열의 값을 비교해서 더 큰 값을 찾으면 변수에 저장한다.
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//------------------------------------------------------------------
		//배열의 값을 섞어주세요.
		//랜덤 인덱스와 0번인덱스의 자리를 여러번 바꾼다.
		for(int i = 0; i < shuffle.length * 10; i++) {
		int random = (int) (Math.random() * shuffle.length); //0부터 9사이의 랜덤인덱스를 만듦
		int temp = shuffle[random];
		shuffle[random] = shuffle[0];
		shuffle[0] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//------------------------------------------------------------------
		
		//1~10 사이의 랜덤값 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		//10자리의 배열을 생성하고 자리에 맞게 count를 해준다.
		
		/*
		 * int[] a = new int[10]; 0,1,2,3
		
		for(int i = 0; i < 500; i++) {
			int random = (int)(Math.random() * 10) + 1;
			for(int j = 0; j < a.length; j++) {
				if (random == j+1) a[j]++; 
			}*/
		
		 
		int[] counts = new int[10];
		for(int i = 0; i < 500; i++) {
			int random = (int)(Math.random() * 10) + 1;
//			if(random == 1) counts[0]++;
//			if(random == 2) counts[1]++;
//			if(random == 3) counts[2]++;
			counts[random - 1]++;
		}
		System.out.println(Arrays.toString(counts));
		}
		
	}


