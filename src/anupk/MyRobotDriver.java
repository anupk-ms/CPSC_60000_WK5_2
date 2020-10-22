package anupk;

public class MyRobotDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.walk();
		robot.setState(robot.getRoboticStandby());
		robot.cook();
		robot.setState(robot.getRoboticStandby());
		robot.walk();
		robot.setState(robot.getRoboticStandby());
		robot.off();
		robot.walk();
		robot.setState(robot.getRoboticStandby());
		robot.off();
		robot.cook();
	}

}
