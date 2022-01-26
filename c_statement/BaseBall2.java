package c_statement;

import java.util.Scanner; 

public class BaseBall2 {

	public static void main(String[] args) {
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		do {
		
		a1 = (int) (Math.random() * 9) + 1;
		a2 = (int) (Math.random() * 9) + 1;
		a3 = (int) (Math.random() * 9) + 1;
		}while(a1 == a2 || a1 == a3 || a2 == a3);
		
		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("3자리의 숫자>");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10; //1의 자리
			input /= 10;
			int i2 = input % 10; //10의 자리
			input /= 10;
			int i1 = input % 10; //100의 자리
			
			int Strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) Strike++;
			if(a2 == i2) Strike++;
			if(a3 == i3) Strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a1 == i3) ball++;
			if(a3 == i1 || a1 == i2) ball++;
			
			out = 3 - Strike - ball;
			
			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
					+ Strike + "S " + ball + "B " + out + "o");
			System.out.println("---------------------------------");
			if(Strike == 3) {
				System.out.println("정답입니다!");
				break;
			}
			
			
		}
		
	}

}
