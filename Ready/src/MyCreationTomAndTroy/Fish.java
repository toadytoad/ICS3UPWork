package MyCreationTomAndTroy;

/*
Tom and Troy
Ms. Krasteva
2021/11/19
This class creates the fish in the second last scene
 */
import hsa.Console;

import java.awt.*;

public class Fish implements Runnable{
    Console c;
    Color color;
    int size;
    int x;
    int y;
    public Fish(Console c, Color color, int size, int x, int y){
        this.c=c;
        this.color=color;
        this.size=size;
        this.x=x;
        this.y=y;
    }


    public void draw(int x, int y){
        x+=this.x;
        y+=this.y;
        c.setColor(color);
        c.fillPolygon(new int[]{x, x, x+size/3}, new int[]{y, y+size/2, y+size/4}, 3);
        c.fillOval(x+size/5, y, size*4/5, size/2);
        c.setColor(Colors.black);
        c.drawPolygon(new int[]{x, x, x+size/3}, new int[]{y, y+size/2, y+size/4}, 3);
        c.drawOval(x+size/5, y, size*4/5, size/2);

    }

    @Override
    public void run(){
        for(int y = 150; y>=50; y--){
            draw(380+x, y+this.y);
            try{
                Thread.sleep(10);
            }catch(Exception ignored){}
        }

    }
}
