package f_game;

public class Monster {
	 // 몬스터한테 변수를 만들어줌
	 String name; 		//이름
	 int maxHp; 		//최대체력
	 int maxMp; 		//최대마나
	 int hp; 			//체력
	 int mp; 			//마나
	 int att; 			//공격력
	 int def; 			//방어력
	 int level; 		//레벨
	 int exp; 			//경험치 (몬스터를 잡았을때 얼만큼의 경험치를 줄것인가)
	 Item[] items; 		//몬스터를 잡았을때 드롭된 아이템, 아이템을 저장할 배열
	 
	 Monster(String name, int hp, int mp, int att, int def, int exp, int level, Item[] items){ // 생성자를 통해서 변수를 초기화
		 this.name = name;
		 this.maxHp = hp;
		 this.maxMp = mp;
		 this.hp = this.maxHp;
		 this.mp = this.maxMp;
		 this.att = att;
		 this.def = def;
		 this.exp = exp;
		 this.level = level;
		 this.items = items;
	 }
	 
	 void attack(Character c) { // 공격하는 메서드 (공격하는 대상이 다르기 때문에 파라미터 타입을 캐릭터로 변경)
		 // 데이미를 얼마를 줄것인가 계산
		 int damage = att - c.def; // (캐릭터의 공격력 - 몬스터의 방어력)
		 damage = damage <= 0 ? 1 : damage; // 몬스터의 방어력이 더 클경우 음수가 되기 때문에 그것을 방지
		 // 데이미가 0이하일때는 최소한 1만큼의 데미지를 준다
		 c.hp -= damage <= c.hp ? damage : c.hp; 
		 // 체력이 -가 되는 상황을 방지
		 System.out.println(name + "가 공격으로 " + c.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		 System.out.println(c.name + "의 남은 체력 : " + c.hp); // 몬스터의 남은 체력;
	 } // 변수이름바꾸기 ctrl + 1
	 
	 Item itemDrop(){ // 몬스터가 싸우고 죽은 후 아이템을 드롭하는 메서드 = 내 아이템을 누군가에게 준다는것 -> return
		return items[(int)(Math.random() * items.length)]; // 인덱스를 랜덤으로 결정, 몬스터가 가지고있는것중 하나를 랜덤으로 드롭
	 }
	 

}
