package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This is the background for the introduction
 */
import hsa.Console;

import java.awt.*;

public class IntroBG {
    Console c;
    public IntroBG(Console c){
        this.c=c;
    }
    public void draw(){
        c.setColor(Colors.black);
        c.fillRect(0, 0, 640, 500);
        c.setColor(Colors.white);
        c.setFont(new Font("Algerian Regular", Font.BOLD, 36));
        c.drawString("Kailey's Birthday", 185, 100);
        c.setFont(new Font("Algerian Regular", Font.BOLD, 24));
        c.drawString("By Tom and Troy", 220, 200);
    }
}
