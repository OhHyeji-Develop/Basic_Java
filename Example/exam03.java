package Example;

import e_oop.ScanUtil;

public class exam03 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;

		do {
			System.out.println("1~100사이의 수를 맞춰주세요 ->");
			input = ScanUtil.nextInt();

			if (answer > input) {
				System.out.println(input + " 보다 큽니다.");
			} else if (answer < input) {
				System.out.println(input + " 보다 작습니다.");
			} else {
				System.out.println("정답입니다.");
			}

		} while (answer != input);
	}
}
