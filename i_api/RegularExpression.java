package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규 표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^		뒷 문자로 시작
		 * &		앞 문자로 종료
		 * .		임이의 1개의 문자(줄바꿈 제외)
		 * *		앞 문자가 0개 이상
		 * +		앞 문자가 1개 이상
		 * ?		앞 문자가 없거나 1개
		 * []		문자의 집합이나 범위([a-z]: a부터 z까지, [^a-z]:a부터 z가 아닌 것
		 * {}		앞 문자의 개수({2}:2개, {2,4}:2개 이상 4개 이하)
		 * ()		그룹화(1개의 문자처럼 인식)
		 * |		OR 연산
		 * \s		공백, 탭, 줄바꿈
		 * \S		공백, 탭, 줄바꿈이 아닌 문자
		 * \w		알파벳이나 숫자
		 * \W		알파벳이나 숫자가 아닌 문자
		 * \d		숫자
		 * \D		숫자가 아닌 문자
		 * (?i)		뒷 문자의 대소문자 구분 안함
		 * \		정규 표현식에서 사용되는 특수문자 표현
		 */
		
		String str = "abc123";
		//String regex = "[a-z]{3}[0-9]{1,3}"; // {1,} -> 1개이상의 숫자
		//String regex = "[a-z0-9]+"; //a부터 z와, 0부터 9중에 하나가 한개 이상
		String regex = "\\w*"; // 알파벡이나 숫자가 0개 이상
		//정규표현식을 만들때 범위를 좁게 만드는게 좋음
		
		Pattern p = Pattern.compile(regex); // Pattern객체 리턴
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		// 아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규 표현식을 만들어주세요.
		// 아이디 : 5~15자리의 영문 소문자, 숫자만 사용가능
		// 아이디 : [a-z0-9_-]{5,20}
		String id = "oegoeg123";
		String regexid = "[a-z0-9]{5,15}";
		
		Pattern pid = Pattern.compile(regexid);
		Matcher mid = pid.matcher(id);
		System.out.println(mid.matches());
		
		// 전화번호 : 11자리 숫자만 사용가능
		// 전화번호 : ^0\\d{1,3}-\\d{3,4}-\\d{4}

		
		String number = "01012345678";
		String regexnum = "[0-9]{11}";
		
		Pattern pnum = Pattern.compile(regexnum);
		Matcher mnum = pnum.matcher(number);
		System.out.println(mnum.matches());
		
		// 이메일 주소 
		// 이메일 : [a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$
		String mail = "oegoeg123@naver.com";
		String regexmail = "[a-z0-9]{1,}\\@[a-z]\\.[a-z]";
		
		Pattern pmail = Pattern.compile(regexmail);
		Matcher mmail = pmail.matcher(mail);
		System.out.println(mmail.matches());
		
		
		
		
	}

}
