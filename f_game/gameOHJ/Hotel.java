package f_game.gameOHJ;

public class Hotel extends Guest{
	
	
	// 호텔의 속성 : 이름, 손님 행복도, 포인트, 손님수, 요리, 청결도, 재정상태,  레벨

	String hname;
	String name;
	int point;
	int guest;
	int guestplus;
	int g_happy;
	int cook;
	int clean;
	int money;
	int level;
	int member;
	

	
	Hotel(String hname, String name){ // 생성자를 받아서 초기화

		this.hname = hname;
		this.name = name;
		this.point = 0;
		this.guest = 1;
		this.g_happy = 10;
		this.clean = 0;
		this.level = 1;
		this.money = 1000;
		this.member = 2;

	}
	
	void info() { // 정보창메서드
		System.out.println("✮⛧✮⛧" + hname + "호텔 정보입니다 ✮⛧✮⛧");
		System.out.println(hname + "호텔의 누적 손님 수 : " + guestplus);
		System.out.println(hname + "호텔의 직원 수 : " + member);
		System.out.println("손님들의 행복지수 : " + g_happy);
		System.out.println(hname + "호텔의 청결도 : " + clean);
		System.out.println(hname + "호텔의 현재 포인트 : " + point);
		System.out.println(hname + "호텔의 현재 레벨 : " + level);
		System.out.println(hname + "호텔의 수입 : " + money);
		System.out.println("온라인 예약건수 : " + reserveplus);
	}
	
	void hello() { // 손님맞이 메서드
		this.guest = (int)(Math.random() * 10) + 1;
		this.guestplus += this.guest;
		this.point += 20;
		System.out.println();
		System.out.println(guest + "명이 체크인 중입니다....");
		System.out.println("손님 : " + guestplus + "명");
		System.out.println("포인트 20 증가!");
		System.out.println();


		while( 200 <= this.point) { // 포인트가 200이 되면 레벨업하고 포인트 리셋, 직원수 3명추가
			levelUp();
			this.point -= 200;
			this.member += 3;
			System.out.println("레벨업!!!");
			System.out.println("직원 2명 추가!");
		}
		
	}
	
	void cleanroom() { // 방청소하는 메서드
		this.clean += 20;
		this.point += 10;
		System.out.println();
		
		System.out.println("청소하는 중입니다 ⯎ ⯎ ⯎");
		System.out.println("포인트 10 증가!");
		System.out.println("청결도 20 증가!");
		System.out.println();

		while( 200 <= this.point) {
			levelUp();
			this.point -= 100;
			this.member += 3;
			System.out.println("레벨업!!!");
			System.out.println("직원 2명 추가!");
		}
	}
	
	void cooking() { // 요리하는 메서드
		this.cook += 30;
		this.point += 10;
		this.g_happy += 20;
		
		System.out.println();
		System.out.println("요리하는 중입니다... (๑╹ڡ╹๑) ");
		System.out.println("포인트 20 증가!");
		System.out.println("요리실력 30 증가!");
		System.out.println("손님의 행복지수 20 증가!");
		System.out.println();

		while( 200 <= this.point) {
			levelUp();
			this.point -= 100;
			this.member += 3;
			System.out.println("레벨업!!!");
			System.out.println("직원 2명 추가!");
		}
		
	}
	
   void money() {
	   this.money = 10000 * this.guestplus; // 손님수 * 10000원씩 돈을 벌수있습니다.
	   
	   System.out.println("현재 " + money + "원을 벌었습니다 :-D");
	   System.out.println();
   }
	
	void levelUp() { // 레벨업하면 50000원 보너스를 받습니다.
		level++;
		money += 50000;
	}
}