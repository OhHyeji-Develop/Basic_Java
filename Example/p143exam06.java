package Example;

public class p143exam06 {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재 시각: " + time + " 시");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		
		
		}

	}

}
