 package ex04.quiz;

public class Airplane {

	private Ibattery battery;
	
	//생성자 주입
	public Airplane (Ibattery battery) {
		this.battery = battery;
	}
	
	public Ibattery getBattery() {
		return battery;
	}
}
