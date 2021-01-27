package ua.lviv.trainapplogos;
import java.util.Random;

public class PlaneControl {
	Random rand = new Random();
	
	double moveUp() {
		return rand.nextInt(5250);		
	}
	
	double moveDown() {
		return rand.nextInt(3220);		
	}
	
	double moveLeft() {
		return rand.nextInt(740);		
	}
	
	double moveRight() {
		return rand.nextInt(947);		
	}
}
