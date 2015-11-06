//

import java.awt.Color;
import java.awt.Graphics2D;

public class WorldObject {
	
	// the name of the object
	String name = "";
	
	// the x pos in the world in meters
	double x;
	
	// the y pos in the world in meters
	double y;

	// the width of the object in meters
	double width;

	// the height of the object in meters
	double height;
	
	public WorldObject(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public WorldObject(String name, double x, double y, double width, double height)
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void update()
	{
		
	}
	
	public void draw(Graphics2D g, int pixelsPerMeter)
	{
		g.drawRect(
				(int)(x*pixelsPerMeter), 
				(int)(y*pixelsPerMeter), 
				(int)(width*pixelsPerMeter), 
				(int)(height*pixelsPerMeter));
	}
}
