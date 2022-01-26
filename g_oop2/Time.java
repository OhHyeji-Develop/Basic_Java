package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	
	// 변수하나당 get으로 시작하는 변수, set으로 시작하는 변수 2개가 만들어짐
	// 변수에 접근하기 위해서는 2개의 메서드를 통해서 접근
	
	public int getHour() { // 변수의 값을 불러오기위한 메서드
		return hour;
	}

	public void setHour(int hour) { // 변수의 값을 저장하기위한 메서드
		if(hour < 0) {
			this.hour = 0;
		}else if (23 < hour) {
			this.hour = 23;
		}else{
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0) {
			this.minute = 0;
		}else if (59 < minute ) {
			this.minute = 59;
		}else{
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0) {
			this.second = 0;
		}else if (59 < second) {
			this.second = 0;
		}else{
			this.second = second;
		}
	}
	
	// 시간이 흘러가는것을 실시간으로 출력
	void clock() {
		while(true) { // 무한반복
			System.out.println(toString()); // 현재 시간 출력
			stop(); // 잠깐 멈춘후
			setSecond(second + 1); // setSecond메서드를 이용해서 1초만큼 증가
		}
	}
	
	private void stop() { // 다른클래스에서 사용할 필요X, 다른 클래스에 노출되지않음
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 프로그램을 잠깐 멈추게하는 메서드
	}
	

	@Override
	public String toString() {
		return hour +":" + minute + ":" + second;
	}
	
}
