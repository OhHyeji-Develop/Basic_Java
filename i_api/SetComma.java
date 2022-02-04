package i_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마를 붙여 출력해주세요. 
		 * 1234567 -> 1,234,567
		 */
		System.out.println("숫자입력>");
		String num = ScanUtil.nextLine();
		String res = "";
		int count = 0;
		for(int i = num.length() -1; i >=0; i--) {
			res = num.charAt(i) + res;
			count++;
			if(count % 3 == 0 && count != num.length()) { //count != num.length() -> 맨앞에 ,를 붙히지 않음
				res = "," + res;
			}
		}
		System.out.println(res);

	}

}
