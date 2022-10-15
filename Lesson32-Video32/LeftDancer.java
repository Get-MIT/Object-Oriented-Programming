import becker.robots.*;


/** LeftDancers dance to the left as they move forward.
 * 
 * @author Byron Weber Becker
 * modified by Alexander Chatzigeorgiou
 *
 * George Mavroudis (mail.getmit@gmail.com) Tried to reproduce the code from
 * videos of youtube (https://youtu.be/rGhv41lWg5I?list=PLPQ9mGt4tRsadCI0E4O8qeJqIKMlcO1GT)
 * I am NOT sure that the code is correct (the same as in the video)
 */

public class LeftDancer extends Dancer{
	
	//private RobotSE robot;
	
	public LeftDancer(City c, int str, int ave, Direction dir) {
		super(c, str, ave, dir);
		robot.setLabel("L");
	}
	
	// Dance to the left
	public void move() {
		robot.turnLeft();
		robot.move();
		robot.turnRight();
		robot.move();
		robot.turnRight();
		robot.move();
		robot.turnLeft();
	}
	
}
