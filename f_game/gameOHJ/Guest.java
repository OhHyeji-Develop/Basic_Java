package f_game.gameOHJ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import e_oop.ScanUtil;

public class Guest {

	String g_date; // 예약일자
	String g_name; // 예약자이름
	String g_number; // 예약자 번호
	int g_count; // 인원수
	int reserveplus;

	String regex1 = "[0-9]{4}/[0-9]{2}/[0-9]{2}"; // 예약일자
	Pattern p1 = Pattern.compile(regex1);

	String regex2 = "^\\d{3}-\\d{3,4}-\\d{4}$";
	Pattern p2 = Pattern.compile(regex2);

	void reserve(Hotel h) { // 예약하기 메서드

		System.out.println("     ☆.。.:*・°☆ ｡+.｡☆ﾟ");

		do {
			System.out.println("예약일자를 입력해주세요. ex)2022/01/01");
			g_date = ScanUtil.nextLine();

			Matcher m1 = p1.matcher(g_date);

			if (!Pattern.matches(regex1, g_date)) {
				System.out.println("형식에 맞게 다시 입력해주세요.");
			}

		} while (!Pattern.matches(regex1, g_date));

		System.out.println("성함을 입력해주세요. ");
		g_name = ScanUtil.nextLine();

		do {
			System.out.println("핸드폰 번호를 입력해주세요. ex)010-1234-5678");
			g_number = ScanUtil.nextLine();

			Matcher m2 = p2.matcher(g_number);

			if (!Pattern.matches(regex2, g_number)) {
				System.out.println("다시 입력해주세요. ex)010-1234-5678");
			}

		} while (!Pattern.matches(regex2, g_number));

		System.out.println("총 인원을 입력해주세요. ");
		g_count = ScanUtil.nextInt();

		System.out.println("날짜 : " + g_date);

		System.out.println("성함 : " + g_name);

		System.out.println("번호 : " + g_number);

		System.out.println("총 " + g_count + "명");

		h.reserveplus++;

		System.out.println("예약이 완료 되었습니다. 감사합니다(^_^)");

		System.out.println();

	}

}
