package practice05_Coffee;

// 아메리카노

public class Americano{

	// 필드
	private Espresso[] cups;  // 에스프레소 여러 잔 들어갈 수 있음
	private int shotCount;    // 아메리카노에 들어간 에스프레소 개수(샷)
	private int extraWater;   // 물
	private int idx;		  // cups 배열의 인덱스
	
	// 생성자
	public Americano(int shotCount, int extraWater) {
		this.shotCount = shotCount;
		this.extraWater = extraWater;
		cups = new Espresso[shotCount];
	}
	
	// 메소드
	public void addEspresso(Espresso espresso) {
		if(idx == shotCount) {
			System.out.println("샷 추가 불가능.");
			return;
		}
		cups[idx++] = espresso;

	}
	
	// 조회 info 메소드
	public void info() {
		
		int totalWater = 0;
		
		for(int i=0; i<cups.length; i++) {
			System.out.println((i+1) +"번째 샷 정보 ");
			cups[i].beanInfo();
			totalWater += cups[i].getWater();
		}
		totalWater += extraWater;
		System.out.println("아메리카노 : " + totalWater + "ml");
	
	}
}