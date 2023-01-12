package practice02_soldier;

public class Soldier {
	
	// 필드
	private Gun gun;
	
	
	
	public Soldier() {
		gun = new Gun();
	}
	
	public void getModel() {
		gun.getModel();
	}
	public void setModel(String model) {
		gun.setModel(model);;
	}
	public void getBullet() {
		gun.getBullet();
	}
	public void setBullet(int bullet) {
		gun.setBullet(bullet);
	}

	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	public void shoot() {
		gun.shoot();
	}
	
	
	
	
	

	
}
