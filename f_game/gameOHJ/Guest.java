package f_game.gameOHJ;

import e_oop.ScanUtil;

public class Guest {
	
	String g_date; // 예약일자
	String g_name; // 예약자이름
	int g_number; // 예약자 번호
	int g_count; // 인원수
	int reserveplus;
	
	void reserve() { // 예약하기 메서드
		System.out.println("     ☆.。.:*・°☆ ｡+.｡☆ﾟ");
		System.out.println("예약일자를 입력해주세요. ex) 20220124");
		g_date = ScanUtil.nextLine();
		System.out.println("성함을 입력해주세요. ");
		g_name = ScanUtil.nextLine();
		System.out.println("핸드폰 번호를 입력해주세요. ");
		g_number = ScanUtil.nextInt();				
		System.out.println("총 인원을 입력해주세요. ");
		g_count = ScanUtil.nextInt();
		
		System.out.println("날짜 : " + g_date);
		System.out.println("성함 : " + g_name);
		System.out.println("번호 : " + g_number);
		System.out.println("총 " + g_count + "명");
		System.out.println("예약이 완료 되었습니다. 감사합니다(^_^)");
		reserveplus();
		System.out.println();

	}
	
	void reserveplus() {
		reserveplus++;
	}
}
