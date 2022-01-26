package f_game;

public class Item {
	
	 String name; 		//이름
	 int hp; 			//체력
	 int mp; 			//마나
	 int att; 			//공격력
	 int def; 			//방어력
	 
	 Item(String name, int hp, int mp, int att, int def){// 초기화하는 생성자
		 this.name = name;
		 this.hp = hp;
		 this.mp = mp;
		 this.att = att;
		 this.def = def;
		 
	 }
	 
	 public String toString(){  // 아이템의 정보를 리턴하는 메서드
		 // toString = 객체의 주소가 아니라 메서드에서 리턴된 내용을 출력
		 String info = name + " :";
		 if(0 < hp) info += " 체력+" + hp; // 일부만 능력치를 올려줌, 앞에 조건문을 달아줌
		 if(0 < mp) info += " 마나+" + mp;
		 if(0 < att) info += " 공격력+" + att;
		 if(0 < def) info += " 방어력+" + def;
		 return info;
	 }
	 
}
