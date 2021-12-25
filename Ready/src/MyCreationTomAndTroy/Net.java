/*
Tom and Troy
Ms. Krasteva
2021/11/19
This class stores the net which is drawn in the second last scene
 */
package MyCreationTomAndTroy;

import hsa.Console;

public class Net implements Runnable{
    Console c;
    public Net (Console c)
    {
        this.c = c;
    }


    public void draw (int y)
    {
        c.setColor(Colors.oceanBlue);
        c.fillRect(342, y+40, 70, 90);
        c.setColor (Colors.brown);
        c.fillRect (344, y+40, 6, 80);
        c.fillRect (362, y+40, 6, 80);
        c.fillRect (380, y+40, 6, 80);
        c.fillRect (396, y+40, 6, 80);
        c.fillRect (412, y+40, 6, 80);

        c.fillRect (342, y+40, 80, 6);
        c.fillRect (342, y+58, 80, 6);
        c.fillRect (342, y+76, 80, 6);
        c.fillRect (342, y+94, 80, 6);
        c.fillRect (342, y+112, 80, 8);

    }

    @Override
    public void run() {
        for(int y = 120; y>=20; y--){
            draw(y);
            try{
                Thread.sleep(10);
            }catch(Exception ignored){}
        }
    }
}
