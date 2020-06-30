package ex04.quiz;

public class Car {
	
	private Ibattery battery;
	
	//생성자 주입
	public Car (Ibattery battery) {
		this.battery = battery;
	}
	
	public Ibattery getBattery() {
		return battery;
	}
}
