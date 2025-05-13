package constructors;

public class RobotFactory {

	public static void main(String[] args) {
		Robot manualRobot = new Robot();
		manualRobot.height=6;
		manualRobot.name="Manual";
		System.out.println("Manual Robot name :"+manualRobot.name);
		
		//while creatng a object we are initializing a variable
		Robot automatedRobot = new Robot("frigg",5,"Problem solving"); 
		System.out.println("Automated Robot name :"+automatedRobot.name);
		System.out.println("Automated Robot age :"+automatedRobot.height);
		System.out.println("Automated Robot functionality :"+automatedRobot.functionality);

		Robot robot = new Robot("Lakki");
		System.out.println(" Robot name :"+robot.name);
	}

}
