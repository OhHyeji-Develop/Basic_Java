package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		
		Alba alba = new Alba(); // Alba의 객체생성
		
		String[] order = alba.order(); // 리턴ㅇ,파라미터x
		
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리 만드는 중.... 완성!!");
		String[] foods = {"완성된 짜장면","완성된 탕수육"};
	
		alba.serving(foods);
		
		alba.pay(order);
		
	}

}
