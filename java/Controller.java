package create2_environment;

import java.util.Timer;
import java.util.TimerTask;

/**
 * This is the main class that will be the link between all the others
 * Each class needs to know who there controller is, preferably by having
 * a static variable that points to it.
 */
public class Controller {
	final int startTimeDelay = 1;
	final int timePeriod = 100;
	
	Window window;
	
	public Controller()
	{
		window = new Window();
		
		new Timer().schedule(new TimerTask() 
		{
			public void run() 
			{
				
			}
		}, startTimeDelay, timePeriod);
	}
	public static void main(String[] args) {new Controller();}
}
