package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This is the background of the 2nd scene
 */
import hsa.Console;

public class ChaseBG {
    Console c;
    public ChaseBG(Console c){
        this.c=c;
    }
    public void draw(){
        c.setColor(Colors.oceanBlue);
        c.fillRect(0, 0, 640, 500);
        c.setColor(Colors.kelpGreen);
        for(double y = 500; y>=200; y--){
            int x = (int)(3*Math.sin(y/5)+30);
            c.drawLine(x , (int)y, x+15, (int)y);
        }
        for(double x = 32; x<=47; x++){
            double y = -0.26*(x-39.75)*(x-39.75)+314.7;
            c.drawLine((int)x,200, (int)x, 500-(int)y);
        }
        for(double y = 500; y>=150; y--){
            int x = (int)(3*Math.sin(y/5)+50);
            c.drawLine(x , (int)y, x+15, (int)y);
        }
        for(double x = 47; x<=62; x++){
            double y = -0.26*(x-54.53)*(x-54.53)+364.7;
            c.drawLine((int)x,150, (int)x, 500-(int)y);
        }
        for(double y = 500; y>=250; y--){
            int x = (int)(3*Math.sin(y/5)+70);
            c.drawLine(x , (int)y, x+15, (int)y);
        }
        for(double x = 69; x<=84; x++){
            double y = -0.26*(x-76.7)*(x-76.7)+264.7;
            c.drawLine((int)x,250, (int)x, 500-(int)y);
        }
    }
}
