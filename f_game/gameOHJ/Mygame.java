package f_game.gameOHJ;

import e_oop.ScanUtil;

public class Mygame {

	Hotel h;
	Guest g;
	int password;
	
	Mygame(){
		h = new Hotel("대전","혜지"); // 먼저 호텔, 관리자 이름 입력
		g = new Guest();
	}

	public static void main(String[] args) {
		
		new Mygame().first(); // 처음에 first 메서드 실행
	}
	
	void first() {
		int input;
		while(true) { // while문을 실행

			System.out.println("         [ ✲✲✲ " + h.hname + "호텔 홈페이지 ✲✲✲ ]     ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(" 1번. 예약하기(손님용) | 2번. 운영페이지(관리자용) | 3번 종료 ");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1: g.reserve(); break; // Guest클래스에 있는 reserve메서드 실행
			case 2: start(); break; // start메서드 실행
			case 3: System.out.println("종료합니다.");
					System.exit(0);	
			}
		}
	}
	
	void start() {

		System.out.println("✮ 관리자 비밀번호를 입력해주세요 ✮");
		password = ScanUtil.nextInt();
		if (password == 1234) {
		
		} else if (password != 1234){
			System.out.println("비밀번호가 틀렸습니다.");
			start();
		}
		
		System.out.println("관리자 이름 : " + h.name);
			
			int input;
			do {
				System.out.println(" - ✧･ﾟ *✧･ﾟ * * ･ﾟ✧* ･ﾟ✧ - ");
			System.out.println("현재 호텔은 : " + h.level + "성급입니다.");
			System.out.println("1.호텔정보 2.일하기 0.마감");
			System.out.println("- - - - - - - - - - - -");
			 input = ScanUtil.nextInt();
		
			switch(input) {
			case 1: h.info(); break; // Hotel클래스에 info 메서드실행
			case 2: 
			System.out.println("할 일을 골라주세요");
			System.out.println("1. 손님맞이 / 2. 객실 치우기 / 3. 음식만들기 / 4. 정산하기 ");
			input = ScanUtil.nextInt();
			if(input == 1) {h.hello(); }
			if(input == 2) {h.cleanroom();}
			if(input == 3) {h.cooking(); } 
			if(input == 4) {h.money();} 
			break;
			case 0:
				System.out.println("호텔 운영을 종료합니다 ヽ(T-T )ノ");
				System.exit(0);	}
		
		}while(input != 0);
		
		}
		
	}