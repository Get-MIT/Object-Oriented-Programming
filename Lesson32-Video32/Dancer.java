import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

public abstract class Dancer extends Thread{
	
	protected RobotSE robot;

	public Dancer(City c, int str, int ave, Direction dir) {
		robot = new RobotSE(c, str, ave, dir);
	}
	
	public abstract void move();
	
			// run() is a method of Abstract Class Thread - We call it by calling .start() on any 
			// subclass of Thread class
	public void run() {
		move();
		move();
		move();
		move();
	}
}
