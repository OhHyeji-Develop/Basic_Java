package g_oop2;

public class Store {
	
	public static void main(String[] args) {
		
		Desktop d1 = new Desktop("삼성 컴퓨터", 1000000);
		Desktop d2 = new Desktop("LG컴퓨터", 1500000);
		
		AirCon ac1 = new AirCon("삼성 에어컨", 2000000);
		AirCon ac2 = new AirCon("LG 에어컨", 2500000);
		
		TV tv1 = new TV("삼성 TV", 3000000);
		TV tv2 = new TV("LG TV", 3500000);
		
		
		Customer c = new Customer(); // 손님객체 생성
		
		c.buy(d1); // 상속받아서 다형성을 사용할 수 있기 때문에 컴파일 에러 발생X
		
		c.buy(ac2); // 에어컨구매
		
		c.buy(tv2); // tv구매
		
		((Desktop)c.items[0]).programming(); // 0번인덱스에는 데스크탑이 들어있음 : 제일 먼저 구매
		// 형변환을 해줘야 programming 사용 가능
		
	}

}

//-------------------------------------------------------

class Product{
// 물건들이 상속받는 부모클래스 생성
	String name; // 이름
	int price;   // 가격
	
	Product(String name, int price){ // 생성자를 받아서 초기화
		this.name = name;
		this.price = price;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo() {
		return name + "(" + price + "원)";
	}
}


class Desktop extends Product{ // Product클래스를 상속받음
	Desktop(String name, int price){
	super(name, price);
	}
	
	void programming() {
		System.out.println("프로그램을 만듭니다.");
	}
}

class AirCon extends Product{
	AirCon(String name, int price){
		super(name, price);
	}
	
	void setTemperature() {
		System.out.println("온도를 설정합니다.");
	}
}

class TV extends Product{ // 변수를 초기화 하기위한 생성자
	TV(String name, int price){ // 파라미터 2개있는 생성자 호출
		super(name, price); // 이름과 가격을 부모클래스의 생성자로 넘겨줌 -> 부모클래스의 생성자 호출
	}
	
	void setChannel() {
		System.out.println("채널을 변경합니다.");
	}
}


// 물건을 구매하는 손님클래스
class Customer{
	int money = 100000000;
	
	Product[] items = new Product[10]; // -> 다형성
	//Product타입의 배열을 만듦 -> 프로덕트의 자식(티비, 에어컨, 데스크탑)들을 items에 저장
	
	//물건을 구매하는 메서드
	void buy(Product p) { // -> 다형성 사용
		// Product 타입의 파라미터를 만들면 티비, 에어컨, 데스크탑을 받을 수 있음
		if (money < p.price) { // 물건의 가겨보다 돈이 부족하면 return을 사용해서 메서드 종료시킴
			System.out.println("잔돈이 부족합니다");
			return;
		}
		
		money -= p.price; // 돈에서 가격만큼 뺀 경우
		
		for (int i = 0; i < items.length; i++) { // 물건을 저장하기 위한 배열에 물건을 저장
			if(items[i] == null) {
				items[i] = p;
				break;
			}
		}
		
		System.out.println(p.getInfo() + "를 구매하였습니다.");
	}
}












