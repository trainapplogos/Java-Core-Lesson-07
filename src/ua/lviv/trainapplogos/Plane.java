package ua.lviv.trainapplogos;
import java.util.Random;

public abstract class Plane {
	double length;
	double width;
	double weight;
	
	Random rand = new Random();
	
	void startEngines() {
		System.out.println("To starting the engines of the aircraft remained " + (rand.nextInt(88 - 20) + 20) + " seconds");
	}
	
	void takeOff() {
		System.out.println("the plane will fly on a full tank of fuel for about " + (rand.nextDouble() * 1000) + " kilometers");
	}
	
	void landindPlane() {
		System.out.println("The plane is landing");
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
