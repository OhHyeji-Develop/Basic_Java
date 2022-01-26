package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태
		 */
		
		//2차원
		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		int[][] arr = new int[2][3]; //1차원배열의 길이는 2, 2차원배열의 길이는 3
		
		/*
		 * 변수 = 100번지(주소)
		 * 
		 * 100번지
		 * {200번지, 300번지}
		 *
		 * 200번지
		 * {0. 0. 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 * 
		 */
		
		int arr2[][] = new int [][] {{1, 2, 3}, {4, 5, 6}}; //1차원은 길이가 2, 2차원은 길이가 3
		
		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //1차원 길이 3, 2차원길이 3
		
		int[][] arr4 = new int[3][]; //가변 배열 //1차원은 길이3, 2차원은 아직 길이가 정해지지않음 -> 사용하고 싶으면 그때그때 만들어서 사용해야함
		arr4[0] = new int[3];
		arr4[1] = new int [4];
		arr4[2] = new int[10];
		
//		arr[0] = 10; //2차원배열인데 1차원까지만 index를 지정하면 값이 저장되지않음 -> 값을 지정할 수 없다.
		arr[0] = new int[5]; //1차원은 배열을 저장하는 곳이다.
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr[0][1]); //값을 출력하고 싶으면 인덱스를 지정해줘야함
		
		System.out.println(arr.length); //1차원의 길이
		System.out.println(arr[0].length); //2차원의 길이
		
		for(int i = 0; i < arr.length; i++) { //1차원에 접근하기 위한 for문
			for(int j = 0; j < arr[i].length; j++) { //2차원에 접근하기 위한 for문
				System.out.println(i + "," + j + " : " + arr[i][j]);
			}
		}
		
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		
		int[] sum = new int[scores.length]; //합계
	    double[] avg = new double[scores.length]; //평균
	    
	    //0부터 100사이의 랜덤한 수를 2차원 배열에 저장
	    //각 학생의 합계와 평균을 각 배열에 저장하고 출력까지
	    
	    for(int i = 0; i < scores.length; i++) {
	    	for(int j = 0; j < scores[i].length; j++) {
	    		scores[i][j] = (int)(Math.random() * 100) + 1;

	    	}
	    	System.out.println(Arrays.toString(scores[i]));
	    }
	    
	    for(int i = 0; i < scores.length; i++) {
	    	for(int j = 0; j < scores[i].length; j++) {
	    		sum[i] += scores[i][j];
	    	}
	    	avg[i] = (double)sum[i] / scores[i].length;
	    	System.out.println("합계 : " + sum[i] + " / 평균 : " + avg[i]);
	    }
		
	}

}
