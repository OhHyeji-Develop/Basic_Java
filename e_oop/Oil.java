package e_oop;

public class Oil {
	
	int oil;
	
	void oilSet(int oil) {
		this.oil = oil;
	}
	
	
	void powerOff() {
		System.out.println("주유가 끝났습니다.");
	}
	
	boolean oilfull() {
		if(oil == 100) {
			System.out.println("기름이 가득찼습니다.");
			return false;
		}
			System.out.println(oil + "L 주유를 시작합니다.");
			return true;
		}
	
	
 public static void main(String[] args) {
	
	 Oil oil = new Oil();
	 
	 oil.oilSet(4);
	 
	 boolean oilful = oil.oilfull();
	 oil.powerOff();
	 
	}

}