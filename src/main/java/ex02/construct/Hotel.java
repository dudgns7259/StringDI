package ex02.construct;

public class Hotel {

	//멤버번수
	private Chef chef;
	
	public Hotel(Chef chef) { //호텔은 쉐프 없으면 생성할 수 없다. (의존적이다)
		this.chef = chef;
	}
	
	//getter
	
	public Chef getChef() {
		return chef;
	}
}
