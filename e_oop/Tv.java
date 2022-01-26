package e_oop;

public class Tv {
	
	int channel = 11;
	int audio = 10;
	
	
	final int MAX_AUDIO = 20;
	final int MIN_AUDIO = 0;
	
	
	void powerOn() {
		System.out.println("티비를 켰습니다.");
	}
	
	void channelUp() {
		if(channel < 50) {
			channel++;
		}
		System.out.println("현재 채널 : " + channel + "번");
	}
	
	void channelDown() {
		channel--;
		System.out.println("현재 채널 : " + channel + "번");
	}
	
	void powerOff() {
		System.out.println("티비를 껐습니다.");
	}
	
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
	}

}
