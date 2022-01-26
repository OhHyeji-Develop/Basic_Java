package f_game;

public class Character {
	
	// 캐릭터의 속성 : 이름, 체력, 공격력, 방어력, 레벨, 경험치
	
	 String name; 		//이름
	 int maxHp; 		//최대체력
	 int maxMp; 		//최대마나
	 int hp; 			//체력
	 int mp; 			//마나
	 int att; 			//공격력
	 int def; 			//방어력
	 int level; 		//레벨
	 int exp; 			//경험치
	 Item[] items; 		//보유아이템을 저장할 배열
	 
	 Character(String name, int hp, int mp, int att, int def){
		 this.name = name; // this타입은 구분해주기 위해 사용하는것
		 this.maxHp = hp;
		 this.maxMp = mp;
		 this.hp = this.maxHp;
		 this.mp = this.maxMp;
		 this.att = att;
		 this.def = def;
		 this.level = 1;
		 this.exp = 0;
		 this.items = new Item[10]; //아이템을 최대 10개까지 보관
	 }
	 
	 
	 void status() {  // 메서드 생성
		 System.out.println("=============== 상태 =================");
		 System.out.println("이름 : " + name);
		 System.out.println("레벨 : " + level + "(" + exp + "/100)");
		 System.out.println("체력 : " + hp + "/" + maxHp);
		 System.out.println("마나 : " + mp + "/" + maxMp);
		 System.out.println("공격력 : " + att);
		 System.out.println("방어력 : " + def);
		 System.out.println("============== 아이템 =================");
		 for(int i = 0; i < items.length; i++) {  // 아이템을 for문을 돌면서 출력
			 if(items[i] != null) {  // null이 아닌경우에만 출력
				 System.out.println(items[i]); // 현재보유한 아이템을 출력, 타입이 items(클래스), 메서드를 안만들어주면 주소를 출력
			 }
		 }
		 System.out.println("=====================================");
	 }
	 
	 void attack(Monster m) { // 공격하는 메서드(몬스터 타입의 파라미터 생성)
		 // 데이미를 얼마를 줄것인가 계산
		 int damage = att - m.def; // (캐릭터의 공격력 - 몬스터의 방어력)
		 damage = damage <= 0 ? 1 : damage; // 몬스터의 방어력이 더 클경우 음수가 되기 때문에 그것을 방지
		 // 데이미가 0이하일때는 최소한 1만큼의 데미지를 준다 
		 m.hp -= damage <= m.hp ? damage : m.hp; 
		 // 체력이 -가 되는 상황을 방지
		 System.out.println(name + "가 공격으로 " + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		 System.out.println(m.name + "의 남은 체력 : " + m.hp); // 몬스터의 남은 체력;
	 }
	 
	 void getExp(int exp) { // 몬스터가 죽은 후 경험치를 얻는 메서드, 경험치를 얼마나 얻는지 외부에서 결정하는 파라미터를 만듦
		 this.exp += exp;
		 System.out.println(exp + "의 경험치를 획득하였습니다.");
		 
		 while(100 <= this.exp){ // 경험치가 최대(100)가 되면 레벨업을 해야함
			 levelUp();
			 this.exp -= 100; // 현재 경험치에서 100만큼 빼면서 레벨업
		 }
		 
	 }
	 
	 void levelUp() {
		 level++; //레벨을 1만큼 증가 -> 다른 능력치들도 증가해줘야함
		 maxHp += 10;
		 maxMp += 5;
		 att += 2;
		 def += 2;
		 hp = maxHp; // 레벨업을 하면 체력과 마나가 최대치로 차도록 만들어줌
		 mp = maxMp;
		 System.out.println("레벨업!!!");
	 }
	 
	 void getItem(Item item) { // 파라미터 필요 : 어떤 아이템을 얻을 것인지
		 System.out.println(item.name + "을 획득하였습니다.");
		 for(int i = 0; i < items.length; i++) { // 캐릭터가 보여한 아이템을 저장한 배열
			 if(items[i] == null) {
				 items[i] = item;
				 break; // 한번 아이템을 얻었으면 break
			 }
		 }
		 maxHp += item.hp; //아이템을 얻으면 바로 캐익터의 능력치에 반영
		 maxMp += item.mp; // 아이템을 가지고만 있어도 바로 능력치에 반영되게함
		 att += item.att;
		 def = item.def;
	 }
	 
	 

}
