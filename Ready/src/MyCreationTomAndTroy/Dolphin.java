package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This class stores all the methods required for drawing Kailey the dolphin
 */
import hsa.Console;


public class Dolphin extends Thread{
    Console c;
    public Dolphin(Console c){
        this.c = c;
    }

    public void run(){
        move(220, 100, 600, -300, 10);
    }
    public void draw(int x, int y){

        int[] arr = {26, 149, 21, 158, 18, 166, 20, 171, 22, 176, 26, 171, 29, 167, 34, 164, 36, 161, 38, 155, 40, 158, 44, 155, 48, 152, 54, 153, 56, 152, 58, 155, 58, 153, 55, 144, 49, 142, 42, 143, 37, 145, 32, 133, 30, 121, 30, 107, 35, 94, 39, 81, 45, 71, 54, 58, 66, 48, 75, 42, 83, 37, 89, 33, 94, 31, 96, 27, 96, 23, 91, 23, 84, 23, 78, 19, 72, 11, 64, 2, 59, 1, 50, 2, 43, 5, 35, 11, 29, 18, 19, 28, 16, 38, 12, 50, 10, 59, 8, 69, 7, 81, 10, 89, 11, 101, 16, 117, 19, 129, 23, 141, 25, 148};

        c.setColor(Colors.oceanBlue);
        c.fillRect(x-5, y-5, 108, 190);
        c.setColor(Colors.dolphinGray);
        drawShapes(x, y, arr);
        arr = new int[]{39, 69, 44, 76, 46, 82, 49, 89, 50, 95, 54, 101, 56, 92, 58, 85, 60, 76, 59, 71, 58, 65, 55, 58, 50, 51, 38, 67};
        c.setColor(Colors.dolphinGray);
        drawShapes(x, y, arr);

        arr = new int[]{20, 29, 15, 28, 10, 29, 5, 32, 2, 32, 1, 28, 2, 23, 3, 19, 7, 16, 11, 14, 16, 14, 20, 16, 24, 19, 25, 20, 20, 29};
        c.setColor(Colors.dolphinGray);
        drawShapes(x, y, arr);
        c.fillOval(60+x, 22+y, 9, 9);
        c.drawLine(80+x, 30+y, 96+x, 27+y);
    }

    private void drawShapes(int x, int y, int[] arr) {
        int[] xPoints;
        int[] yPoints;
        xPoints = new int[arr.length/2];
        yPoints = new int[arr.length/2];
        for(int i = 0; i<arr.length/2; i++){
            xPoints[i] = arr[2*i]+x;
            yPoints[i] = arr[2*i+1]+y;
        }
        c.fillPolygon(xPoints, yPoints, xPoints.length);
        c.setColor(Colors.black);
        c.drawPolygon(xPoints, yPoints, xPoints.length);
    }
    public void move(int x1, int y1, int x2, int y2, int delay){
        for(double i = 0; i<=1; i+=0.005){
            draw((int)((1-i)*x1+i*x2), (int)((1-i)*y1+i*y2) );
            try {
                Thread.sleep(delay);
            }
            catch(Exception ignored){}
        }
    }
}
