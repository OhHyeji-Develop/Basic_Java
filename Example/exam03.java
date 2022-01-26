package Example;

public class exam03 {

	public static void main(String[] args) {
		
		/*	
		 *  거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 *  거스름돈에 몇개의 동전이 필요한가
		 *  
		 *  거스름돈 : 2860원 
		 *  500원 : 5개
		 *  100원 : 3개
		 *  50원 : 1개
		 *  10원 : 1개
		 * 
		 */
		
		//(int)(Math.random() * 500) -> 0 ~ 500
		//(int)(Math.random() * 500) * 10 -> 0 ~ 500에서 10을 곱한값
		int money = (int)(Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10};
		
		System.out.println("거스름돈 : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원 : " + money / coin[i]);
			money %= coin[i];
			
			}
				
	}
}
