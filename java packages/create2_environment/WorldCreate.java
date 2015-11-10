package create2_environment;

import worldObjects.Wobj_wall;

public class WorldCreate {
	
	public static void create(World w)
	{
		w.add(new Wobj_wall(50, 50));
	}
}
