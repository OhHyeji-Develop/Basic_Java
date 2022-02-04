package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
	

	public static void main(String[] args) {
		/*
		 * Collection Framework (클래스의 불편함 : 통일되어있지 않음)
		 * (Collection : 배열의 발전된 형태)
		 *  - List ( 배열과 비슷, 인덱스가 있어서 인덱스 순으로 데이터 저장 )
		 *  - Map ( 데이터 저장할때 인덱스에 저장하는게 아니라 키에 값을 저장함 ) 
		 *  - Set ( 배열과 비슷하게 값을 저장하지만, 중복된 값이 2번 저장되지 않음, 흔히 사용X )
		 *  (List, Map, Set은 모두 인터페이스)
		 *  
		 * ArrayList의 주요 메서드 (arraylist를 사용하는 이유 : 저장된 값을 가져오는 속도가 빠름, 대신 값을 삭제하거나 수정하는 속도는 느림)
		 *  - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.(파라미터에 저장하고싶은 값을 넣어줌 -> 인덱스 순서대로 저장됨 (삭제하면 크기 줄어듬 -> 유동적인 크기))
		 *  - void add(int index, Object obj) : 지정된 인덱스 위치에 객체를 추가한다. (저장된 애들이 한칸씩 뒤로 밀림)
		 *  - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다. (set->수정하는 메서드), 기존데이터값이 리턴되고 새로운 데이터값이 저장됨
		 *  - Object get(int index) : 지정된 위치의 객체를 반환한다.
		 *  - int size() : 저장된 객체의 수를 반환한다. (arraylist의 길이를 반환하는 메서드 = length와 비슷)
		 *  - Object remove(int index) : 지정된 위치의 객체를 제거한다. (리턴타입Object는 삭제된 값을 리턴, 삭제되면 뒤에서부터 한칸씩 땡겨옴)
		 */
		
		ArrayList sample = new ArrayList(); // ArrayList의 객체생성
		
//		(ArrayList에는 타입 상관없이 아무거나 저장 가능, 값을 꺼낼때 어떤 타입인지 알기 힘듦)
		sample.add("abc"); //값 저장
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList 재생성, <타입> -> ArrayList의 타입 지정, 객체만 저장가능 -> 클래스여야함
//		list.add("abc"); -> 에러
		list.add(10);
		list.add(new Integer(20)); // 이 버전에서는 Integer를 더이상 사용할 수 없음(줄이 찍-)
		/*
		 * Wrapper 클래스 (기본형 타입 8가지를 대신하기위한 클래스, 기본형 타입을 객체형태로 사용해야할때 대신 사용)
		 * (둘 사이에는 자동으로 형변환이 됨)
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - char : Character
		 * - boolean : Boolean
		 */
		System.out.println(list.add(30)); // -> boolean타입의 값이 리턴됨(저장의 성공여부)
		System.out.println(list); // -> 저장된 내용을 출력 ( 주소X, 안에 들어있는 내용O)
		
		//인덱스를 지정해서 저장하는 add ( 현재 저장된 인덱스 내에서만 저장이 가능)
		
		list.add(1, 40); // 1번 인덱스에 40을 저장 -> 뒤로 있는 애들이 한칸씩 밀려남
		System.out.println(list); 
		
		//수정하는 메서드 set
		
		int before = list.set(2, 50); // 인덱스를 지정해서 저장하고 싶은 값을 넣어줌, 기존에 저장되어있던 값을 리턴
		System.out.println("before : " + before);
		System.out.println(list);
		
		//값을 얻기위한 get메서드
		
		int get = list.get(2);
		System.out.println(get); // 2번인덱스에 있는 50 출력
		
		//size, remove
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.remove(i)); // for문을 돌면서 remove진행, 삭제된값은 리턴됨
		}
		System.out.println("-" + list); // 리턴된값 출력, 뒤에있는 애들이 계속 땡겨져서 2번만 돌게됨
		// 여러개 삭제할때는 for문을 증가하는 방향으로 돌리면 제대로 삭제 불가능
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list);
		
		// Q. list에 1~100사이의 랜덤값 10개 저장해주세요.
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 100) + 1;
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
		System.out.println("sum : " + sum + "/ avg : " + avg);
		
		
		// Q. list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
			if(max < list.get(i)){
				max = list.get(i);
			}
		}
		System.out.println("min : " + min + " / max : " + max);

		
		// Q. list를 오름차순으로 정렬해주세요.
		for(int i = 0; i < list.size() - 1; i++) { // list.size()의 길이 10 - 1
			min = i;
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(j) < list.get(min)) {
					min = j;
				}
			}
//			int temp = list.get(i);
//			list.set(i, list.get(min));
//			list.set(min, temp);
			
			list.set(i, list.set(min, list.get(i))); // 한줄표현
		}
		System.out.println(list);

		//2차원 ArrayList
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list = new ArrayList<Integer>(); //list변수에 새로운 객체를 만들어서 저장
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<Integer>();
		list.add(40);
		list.add(50);
		list.add(60);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> list3 = list2.get(i); // 값을 하나 꺼냄
			for(int j = 0; j < list3.size(); j++) {
				System.out.println(list3.get(j));
			}
		}
		
		Integer integer = list2.get(0).get(1); // 특정값 출력
		//list2.get(0)부터 실행 -> 1차원 Arraylist
		System.out.println(integer);
		
		// Q. 학생 3명의 5과목에 대한 0~100점의 랜덤한 점수를 2차원 ArrayList에 저장해주세요
		list2 = new ArrayList<ArrayList<Integer>>(); // 5과목
		
		for(int i = 0; i < 3; i++) { // 3명의 학생
			list2.add(new ArrayList<Integer>()); // Arraylist 3개를 만든다.
			for(int j = 0; j < 5; j++) { // 5과목
				list2.get(i).add((int)(Math.random() * 101)); 
				// new ArrayList<Integer>() = list.get(i)
			}
		}
		System.out.println(list2);
		
		// Q. 각 학생별 합계와 평균을 구해주세요.
		ArrayList<Integer> sum1 = new ArrayList<Integer>(); // 합계를 저장할 ArrayList
		ArrayList<Double> avg1 = new ArrayList<Double>();
		
		for(int i = 0; i < list2.size(); i++) {
			sum = 0;
			for(int j = 0; j < list2.get(i).size(); j++) {
				sum += list2.get(i).get(j); //get(i) -> 학생, get(j) -> 점수
			}
			sum1.add(sum);
			avg1.add((double)sum / list2.get(i).size());
		}
		System.out.println("sum : " + sum1 + " / avg : " + avg1);
		
	}
}
