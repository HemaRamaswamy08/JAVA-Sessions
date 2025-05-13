package constructors;

public class Robot {
	String name;
	int height;
	String functionality;
	//while creatng a object we are initializing a variable
	public Robot(String robotName,int robotHeight, String robotFunctionality) {
		name = robotName;
		height = robotHeight;
		functionality = robotFunctionality;
	}
	public Robot(String robotName) {
		name= robotName;
	}
	public Robot() { //if there is no constructore default const is created by JVM that's how we use 
		//Robot robo = new Robot(); to inialize variables.
		// if even a single const is present JVM doesn't create a constructor
		
	}

}
