import java.util.Timer;
import java.util.TimerTask;

/**
 * This is the main class that will be the link between all the others
 * Each class needs to know who there controller is, preferably by having
 * a static variable that points to it.
 */
public class Controller {
	final int startTimeDelay = 1;
	final int timePeriod = 5;
	
	Window window;
	World world;
	
	public Controller()
	{
		world = new World(12, 10, 60);
		new WorldCreate(world);
		window = new Window(world);
		
		// a timer that calls the step method every timePeriod
		new Timer().schedule(new TimerTask() 
		{
			public void run() 
			{
				step();
			}
		}, startTimeDelay, timePeriod);
	}
	
	public void step()
	{
		world.update();
		window.update();
		window.draw();
	}
	
	// no need to even look at
	public static void main(String[] args) {new Controller();}
}
