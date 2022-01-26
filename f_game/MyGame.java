package f_game;

import e_oop.ScanUtil;

public class MyGame {  //  게임의 내용만들기
	
	// 게임에 등장하는 것들을 변수로 만들기
	Character c;
	Item[] items;
	
	MyGame(){ //  변수를 초기화 
		c = new Character("가렌", 100, 50, 20, 10);
		
		items = new Item[10]; // 아이템은 10개까지 만들수있게
		items[0] = new Item("무한의대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);
	}
	
	// 몬스터는 사냥을 할때만 그때그때 만들어서 사용
	

	public static void main(String[] arg1s) { 
		
		// 메인메서드에서는 static이 붙어있기때문에 -> 메인메서드에서 직접 코딩을 하면 변수들을 사용할때 그냥 사용할 수 없고 객체생성을 해서 사용해야함
		// static - 메모리에 먼저 올라가있는 상태
		// 객체생성을 해줘야만 변수를 사용가능
		// System.out.println(new MyGame().c);
		
		new MyGame().start(); // 메서드 호출
		}
	void start() {  // start 메서드 안에서 코드작성 -> 객체생성하지 않아도 그냥 사용가능
		
		while(true) {
			System.out.println("1. 내정보 2.사냥 0.종료>"); // 내정보를 보거나 사냥을 하거나
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: c.status(); break;
			case 2: hunt(); break; // 사냥하는 메서드
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0); // -> 프로그램을 강제 종료시키는 메서드
			}
		}

	}
	
	void hunt() { //사냥하는 메서드
		Monster m = new Monster("고블린", 20, 10, 15, 10, 1, 150,  new Item[] {items[0], items[1]});
		System.out.println(m.name + "을 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true) {
			System.out.println("1.공격 2.도망>");
			input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
				c.attack(m);
				if(m.hp <= 0) { // 몬스터의 체력이 0이 되었을때 몬스터가 죽으면서 경험치와 아이템을 얻음
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(m.exp);
					c.getItem(m.itemDrop());
					System.out.println();
					break battle;
				}
				
				m.attack(c);
				break;
				
			case 2:
				System.out.println(m.name + "으로부터 도망쳤습니다.");
				break battle;
			}
		}
	}

}
