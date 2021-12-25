// The "EatCakeBG" class.
package MyCreationTomAndTroy;
import java.awt.*;
import hsa.Console;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This class stores the background of the last scene
 */
public class EatCakeBG
{
    Console c;           // The output console

    public EatCakeBG (Console c)
    {
        this.c = c;
    }

    public void background ()
    {
        c.setColor (Colors.sand);
        c.fillRect (0,400,640,140);

        c.setColor (Colors.oceanBlue);
        c.fillRect (0,95,640,305);

        c.setColor (Colors.skyBlue);
        c.fillRect (0,0,640,95);

        //sun
        c.setColor (Colors.yellow);
        c.fillOval (3,3,52,52);

        //boat flag pole
        c.setColor (Colors.white);
        c.fillRect (247,10,10,70);

        //table
        c.setColor (Colors.brown);
        c.fillRect (380,370,20,30);
        c.fillRect (425,370,20,30);
        c.fillRect (340,355,140,15);

        //boat body
        c.fillArc (200,70,105,40,180,360);
        c.fillRect (200,70,105,20);

        //boat flag
        c.setColor (Colors.orchid);
        c.fillRect (247,10,100,30);

        //flag text
        c.setColor (Colors.black);
        c.setFont (new Font ("Courier",Font.PLAIN,13));
        c.drawString ("Tom and Troy",247,28);

    }
} // EatCakeBG class