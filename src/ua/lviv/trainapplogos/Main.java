package ua.lviv.trainapplogos;

public class Main {

	public static void main(String[] args) {
		SU_27 su27 = new SU_27(2500, "gray");
		
		su27.startEngines();
		su27.takeOff();
		su27.moveUp();
		su27.moveLeft();
		su27.moveDown();
		su27.moveRight();
		su27.stealthTechnology();
		su27.nuclearStrike();
		su27.turboAcceleration();
		su27.landindPlane();
		
	}

}
