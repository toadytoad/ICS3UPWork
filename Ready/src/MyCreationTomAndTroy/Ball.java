package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This is the ball which flies off in the 1st and 2nd scene
 */
import hsa.Console;

public class Ball {
    Console c;
    public Ball(Console c){
        this.c=c;
    }
    public void draw(int x, int y){
        c.setColor(Colors.oceanBlue);
        c.fillOval(x-5, y-5, 30, 30);
        c.setColor(Colors.red);
        c.fillOval(x, y, 20, 20);
        c.setColor(Colors.black);
        c.drawOval(x, y, 20, 20);
    }
    public void move(int x1, int y1, int x2, int y2){
        for(double i = 0; i<=1; i+=0.005){
            draw((int)((1-i)*x1+i*x2), (int)((1-i)*y1+i*y2) );
            try {
                Thread.sleep(10);
            }
            catch(Exception ignored){}
        }
    }
}
