package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
    
		/* 스캐너를 이용해서 문장을 출력 - O의 갯수를 세면 됨
		 * 
		 * 탄수화물 중독 자가진단 테스트
		 *  
		 * 아침을 배불리 먹은 후 점심시간 전에 배가 고프다
		 * 밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다
		 * 음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다
		 * 정말 배고프지 않더라도 먹을 때가 있다
		 * 저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다
		 * 스트레스를 받으면 자꾸 먹고 싶어진다
		 * 책상이나 식탁 위에 항상 과자, 초콜릭 등이 놓여있다
		 * 오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안잡힌다
		 * 과자, 초콜릿 등 단 음식은 상상만 해도 먹고 싶어진다
		 * 다이어트를 위해 식이조절을 하는데 3일도 못 간다
		 * 
		 * 3개 - 주의! 위험한 수준은 아니지만 관리 필요
		 * 4~6개 - 위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함
		 * 7개 이상 - 중독! 전문의 상담이 필요함
		*/
		
		Scanner sc = new Scanner(System.in); 
		
		
//		int a = Integer.parseInt(sc.nextLine());
//		int ans = 0;
//		
//		if (a == 1){
//			ans = 1;
//		}else if ( a == 0) {
//			ans = 0;
//		}
//		
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다. 맞으면 1, 아니면 0 > ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다. 맞으면 1, 아니면 0 > ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("음식을 금방 먹은 후 에도 만족스럽지 못하고 더 먹는다. 맞으면 1, 아니면 0 > ");
		int c = Integer.parseInt(sc.nextLine());
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다. 맞으면 1, 아니면 0 > ");
		int d = Integer.parseInt(sc.nextLine());
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다. 맞으면 1, 아니면 0 > ");
		int e = Integer.parseInt(sc.nextLine());
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다. 맞으면 1, 아니면 0 > ");
		int f = Integer.parseInt(sc.nextLine());
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다. 맞으면 1, 아니면 0 > ");
		int g = Integer.parseInt(sc.nextLine());
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안잡힌다. 맞으면 1, 아니면 0 > ");
		int h = Integer.parseInt(sc.nextLine());
		System.out.print("과자, 초콜릿 등 단 음식은 상상만 해도 먹고 싶어진다. 맞으면 1, 아니면 0 > ");
		int i = Integer.parseInt(sc.nextLine());
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못 간다. 맞으면 1, 아니면 0 > ");
		int j = Integer.parseInt(sc.nextLine());
		
		int sum = (a + b + c + d + e + f + g + h + i + j);
		
		System.out.println("총 " + sum + "개");
		
		if (sum >= 7) {
			System.out.println("중독! 전문의 상담이 필요함");
		}else if(sum >= 4) {
			System.out.println("위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요");
		}else if(sum < 3) {
			System.out.println("주의! 위험 수준은 아니지만 관리 필요");
		}
	
		
	}

}
