package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This is the shark which chases Kailey in the second scene
 */
import hsa.Console;

import java.awt.*;

public class Shark {
    Console c;
    public Shark(Console c){
        this.c = c;
    }
    public void draw(int x, int y){
        c.setColor(Colors.oceanBlue);
        c.fillRect(x-5, y-5, 310, 203);
        c.setColor(Colors.white);
        drawShapes(x, y, new int[]{27, 60, 26, 75, 27, 92, 31, 104, 37, 116, 53, 129, 67, 138, 80, 149, 96, 156, 113, 160, 132, 163, 155, 163, 171, 158, 191, 153, 208, 146, 223, 138, 232, 126, 246, 115, 256, 102, 265, 90, 246, 98, 228, 103, 206, 104, 185, 101, 164, 99, 152, 95, 141, 89, 130, 82, 117, 74, 105, 64, 94, 54, 76, 43, 67, 42, 56, 45, 46, 46, 36, 49, 29, 53, 27, 60}, true);
        c.setColor(Colors.sharkGray);
        drawShapes(x, y, new int[] {75, 41, 92, 33, 104, 24, 123, 21, 137, 21, 153, 24, 169, 28, 188, 37, 207, 51, 224, 62, 234, 70, 243, 79, 253, 85, 263, 92, 251, 98, 231, 104, 198, 105, 173, 101, 155, 96, 131, 85, 117, 72, 101, 61, 88, 49, 77, 43, 76, 40}, true);
        c.setColor(Colors.sharkGray);
        drawShapes(x, y, new int[] {149, 22, 164, 12, 174, 5, 186, 1, 193, 0, 203, 0, 211, 0, 216, 4, 208, 6, 197, 12, 192, 18, 186, 24, 185, 31, 192, 40, 151, 23, 149, 21}, true);
        c.setColor(Colors.sharkGray);
        drawShapes(x, y, new int[]{261, 89, 260, 79, 264, 71, 274, 65, 282, 60, 290, 55, 297, 59, 298, 66, 298, 73, 299, 79, 290, 84, 283, 88, 278, 92, 278, 99, 282, 107, 286, 117, 287, 128, 287, 137, 282, 138, 276, 140, 271, 134, 265, 128, 264, 123, 261, 118, 258, 111, 257, 103, 261, 95, 263, 93, 261, 88}, true);
        c.setColor(Colors.white);
        drawShapes(x, y, new int[] {64, 135, 57, 140, 55, 146, 51, 154, 52, 165, 57, 161, 61, 157, 66, 153, 73, 147, 75, 145, 64, 135}, true);
        c.setColor(Colors.white);
        drawShapes(x, y, new int[]{127, 148, 128, 162, 133, 175, 137, 183, 143, 191, 146, 192, 146, 186, 142, 175, 144, 165, 147, 154, 127, 148}, true);
        drawShapes(x, y, new int[] {47, 89, 48, 100, 56, 106, 66, 108, 74, 108, 85, 106, 92, 101, 96, 92, 98, 85, 86, 88, 76, 90, 67, 91, 60, 90, 48, 89}, false);
        c.setColor(Color.white);
        drawShapes(x, y, new int[]{47, 90, 50, 97, 52, 91, 56, 96, 59, 93, 63, 96, 66, 91, 70, 96, 73, 92, 77, 96, 80, 91, 84, 94, 87, 89, 91, 91, 93, 86, 99, 89, 100, 84, 99, 82, 93, 85, 87, 88, 80, 90, 73, 90, 67, 90, 58, 90, 47, 88}, true);
        c.setColor(Colors.white);
        drawShapes(x, y, new int[] {55, 104, 58, 101, 62, 103, 66, 101, 70, 104, 74, 101, 81, 104, 83, 100, 88, 103, 84, 106, 75, 109, 67, 108, 59, 107, 55, 105}, true);
        c.setColor(Colors.white);
        c.fillOval(110+x, 40+y, 12, 12);
        c.setColor(Colors.black);
        c.fillOval(113+x, 43+y, 6, 6);
        c.drawArc(115+x, 45+y, 30, 30, 300, 60);
        c.drawArc(115+x, 45+y, 40, 40, 300, 60);
        c.drawArc(115+x, 45+y, 50, 50, 300, 60);

    }
    private void drawShapes(int x, int y, int[] arr, boolean drawOutline) {
        int[] xPoints;
        int[] yPoints;
        xPoints = new int[arr.length/2];
        yPoints = new int[arr.length/2];
        for(int i = 0; i<arr.length/2; i++){
            xPoints[i] = arr[2*i]+x;
            yPoints[i] = arr[2*i+1]+y;
        }
        c.fillPolygon(xPoints, yPoints, xPoints.length);
        if(drawOutline) {
            c.setColor(Colors.black);
            c.drawPolygon(xPoints, yPoints, xPoints.length);
        }
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
