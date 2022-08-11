package GenericLibrary;

import java.util.Random;

/**
 * This class contains all java specific generic methods
 * @author divya
 *
 */
public class JavaLibrary
{
	public int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(1000);
	}
}
