package practice02_soldier;

public class Gun {
	
	/*
	 * 
	   has a 관계
	   1. 상속 관계로 만들 수 있는 관계이다.
	   2. Soldier has a Gun
	   3. 자식 has a 부모
	 
	 */
	
	private String model;
	private int bullet;
	private final int MAX_BULLET = 20;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	// 총알 넣기
	public void reload(int bullet) {
		
		if(bullet <= 0 || this.bullet == MAX_BULLET) {
			return;
		}
		
		this.bullet += bullet;
		
		if(this.bullet >20) {
			this.bullet = 20;
		}
		
	}
	// 총 쏘기
	public void shoot() {
		if(bullet <= 0) {
			System.out.println("헛빵");
			return;
		}
		bullet --;
		System.out.println("빵");
	}

}
