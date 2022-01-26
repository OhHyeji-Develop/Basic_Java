package e_oop;

public class AriConOHJ {

	//변수 : 그 대상이 가지고있는 것 중 변하는것, 조작할 수 있는것
	//메서드 : 그 대상이 하는 동작, 행동
	
	//에어컨이 가지고있는 속성 : 전원, 온도, 풍향... -> 변수
	//에어컨이 하는 동작 : 변수를 조작할 수 있는 메서드, 버튼들 -> 전원을 키고 끄는 메서드, 온도를 올리고 내리는 메서드, 풍향을 변경하는 메서드 (버튼 하나가 메서드가 된다고 생각하면 됨)
	
	
	
	public static void main(String[] args) {
		
		AirConOHJ air = new AirConOHJ();
		
		
     	air.powerOn();
     	System.out.println();
//     	int hot = air.hot();
//     	System.out.println(hot + "도를 올렸습니다.");
     	System.out.println();
     	air.powerOff();
		
		
	}
	
	
}

class AirConOHJ{
	
	void powerOn() {
		 System.out.println("에어컨 전원을 켭니다.");
	}
	
//	int hot() {
//		for(int i = 0; i < 60; i++) {
//			
//		}
//		return hot();
//	}
//	
	int cold;
	int windPlus;
	int windMinus;
	
	void powerOff() {
		System.out.println("에어컨 전원을 끕니다.");
	}
	
}