package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 숫자 야구
		 * 서로 중복되지않는 3자리의 숫자를 맞추기
		 * ex) 정답이 1 2 3
		 * 			 1 3 5 : 1S(같은숫자, 같은자리) 1B : (같은 숫자) 1O (하나가 불일치)
		 * 
		 * 379 : 3O
		 * 124 : 1S 1B 1O
		 * 248 : 1S 2B 0O
		 * 842 : 0S 3B 0O
		 * 428 : 3S
		 *
		 */
		
		
		Scanner s = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int Str = 0;
		int Ball = 0;
		int out = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		do {
			num1 = (int) (Math.random() * 9) + 1;
			num2 = (int) (Math.random() * 9) + 1;
			num3 = (int) (Math.random() * 9) + 1;
		} while (num1 == num2 || num2 == num3 || num1 == num3);

		do {

			Str = 0;
			Ball = 0;
			out = 0;

			System.out.println("첫번째 숫자 입력 -> ");
			a = Integer.parseInt(s.nextLine());
			System.out.println("두번째 숫자 입력 -> ");
			b = Integer.parseInt(s.nextLine());
			System.out.println("세번째 숫자 입력 -> ");
			c = Integer.parseInt(s.nextLine());

			if (a == num1) {
				Str++;
			} else if (b == num1 || c == num1) {
				Ball++;
			} else {
				out++;
			}

			if (b == num2) {
				Str++;
			} else if (a == num2 || c == num2) {
				Ball++;
			} else {
				out++;
			}

			if (c == num3) {
				Str++;
			} else if (a == num3 || b == num3) {
				Ball++;
			} else {
				out++;
			}

			System.out.println(Str + "S " + Ball + "B " + out + "O");

		} while (Str != 3);

	}
}
