package e_oop;

public class Static {

	/*
	 *  static (static을 메서드에 붙히는 이유는 객체생성을 하지 않기위해 사용(너무 자주 사용되기 때문))
	 *  - static을 붙이면 프로그램 실행시 메모리에 올라간다.
	 *  - 객체생성을 하지 않아도 사용할 수 있다.
	 *  - static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 *  - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 *  - static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 *  
	 */
	
	// 변수의 위치에 따라 메서드 안에 있으면 지역변수, 밖에 있으면 전역변수
	// static의 여부에 따라 전역변수 중 static이 붙으면 클래스 변수, 붙지 않으면 인스턴스 변수
	// 모두에게 적용되는 것은 static을 붙힌다. (각자 적용x)
	
	// 변수에 static을 붙이는 이유는 값을 공유하기 위함이다.
	
	public static void main(String[] args) {

		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		System.out.println("m1 HP : " + m1.hp);
		System.out.println("m2 HP : " + m2.hp);
		
		m1.hp -= 10;
		m2.hp -= 20;
		
		System.out.println("m1 HP : " + m1.hp);
		System.out.println("m2 HP : " + m2.hp);
		
		System.out.println("m1 ATT : " + m1.attack);
		System.out.println("m1 DEF : " + m1.defence);
		System.out.println("m2 ATT : " + m2.attack);
		System.out.println("m2 DEF : " + m2.defence);
		
		m1.attack += 1;
		m2.defence += 1;
		
		System.out.println("m1 ATT : " + m1.attack);
		System.out.println("m1 DEF : " + m1.defence);
		System.out.println("m2 ATT : " + m2.attack);
		System.out.println("m2 DEF : " + m2.defence); // static이 붙어서 모든 객체에 적용됨
		
		System.out.println(Math.random()); //  static이 붙은 애들은 클래스이름적고 .(점)을 찍으면 알수있음
		
		
		System.out.println("문자열 입력>");
		String str = ScanUtil.nextLine();
		System.out.println("입력받은 문자열 : " + str);
		
		System.out.println("숫자 입력>");
	    int num = ScanUtil.nextInt();
	    System.out.println("입력받은 숫자 : " + num);
		
		
	}

}

class Marine{ // 클래스 생성
	int hp = 40; // 체력
	static int attack = 5; // 공격력 (모두에게 적용되는 애들은 static을 붙힌다.)
	static int defence = 0; // 방어력
	
	
}





