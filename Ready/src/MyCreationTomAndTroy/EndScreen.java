package MyCreationTomAndTroy;

import java.awt.*;
import hsa.Console;
import java.lang.*;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This class creates the endscreen
 */

public class EndScreen
{
    Console c;           // The output console

    public EndScreen (Console c)
    {
	this.c = c;
    }


    private void background ()
    {
	c.fillRect (0, 0, 800, 500);
    }


    public void drawText ()
    {
	c.setFont (new Font ("Courier", 0, 100));
	for (int i = 0 ; i < 200 ; i++)
	{
	    c.setColor (Color.black);
	    background ();
	    c.setColor (Color.white);
	    c.drawString ("The End", 109, i);
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception ignored)
	    {
	    }

	}
	c.setFont (new Font ("Courier", 0, 25));
	c.drawString ("By: Tom Philip and Troy Saldanha-Martins", 20, 250);
    }
} // EndScreen class


