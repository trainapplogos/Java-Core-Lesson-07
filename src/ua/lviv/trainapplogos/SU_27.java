package ua.lviv.trainapplogos;
import java.util.Random;

public class SU_27 extends Plane implements SpecialFunctions {
	int maxSpeed;
	String color;

	PlaneControl planeControl = new PlaneControl();
	Random rand = new Random();
	
	public SU_27(int maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
		setParams();
	}

	void setParams() { //set parameters of the aircraft
		setLength(21.9);
		setWidth(14.7);
		setWeight(16380);
	}
	
	
	void moveUp() {
		System.out.println("The aircraft moves up to " + planeControl.moveUp() + " meters");
	}
	
	void moveDown() {
		System.out.println("The aircraft moves down to " + planeControl.moveDown() + " meters");
	}
	
	void moveLeft() {
		System.out.println("The aircraft moves left to " + planeControl.moveLeft() + " meters");
	}	
	
	void moveRight() {
		System.out.println("The aircraft moves right to " + planeControl.moveRight() + " meters");
	}
	
	@Override
	void startEngines() {
		super.startEngines();
	}
	
	@Override
	void takeOff() {
		super.takeOff();
	}
	
	@Override
	void landindPlane() {
		super.landindPlane();
	}
	
	@Override
	public void turboAcceleration() {
		System.out.println("Activating turbo acceleration mode: current speed is " + (rand.nextInt(1000) + maxSpeed) + " km/h");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("Activating Stealth mode. The aircraft is invisible for " + rand.nextInt(300) + " minutes");	
	}

	@Override
	public void nuclearStrike() {
		System.out.println("Processing nuclear strike: it will be dropped " + (rand.nextInt(9) + 1) + " nuclear bombs");
	}

	
	//getters-setters
	@Override
	public double getLength() {
		return super.getLength();
	}
	
	@Override
	public void setLength(double length) {
		super.setLength(length);
	}
	
	@Override
	public double getWidth() {
		return super.getWidth();
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
	}
	
	@Override
	public double getWeight() {
		return super.getWeight();
	}
	
	@Override
	public void setWeight(double weight) {
		super.setWeight(weight);
	}
	
}
