package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This is a static turtle which appears in the last scene
 */
import hsa.Console;

public class Turtle {
    Console c;
    public Turtle(Console c){
        this.c = c;
    }
    public void draw(int x, int y){
        c.setColor(Colors.oceanBlue);
        c.fillRect(x, y, 145, 85);
        c.setColor(Colors.brown);
        drawShapes(x, y, new int[] {37, 44, 36, 34, 40, 25, 45, 17, 56, 8, 64, 4, 74, 1, 83, 1, 92, 1, 97, 5, 104, 11, 106, 17, 108, 26, 94, 39, 82, 43, 72, 48, 62, 52, 51, 54, 44, 52, 39, 49}, true);
        c.setColor(Colors.darkBrown);
        drawShapes(x, y, new int[]{38, 44, 49, 51, 58, 49, 68, 45, 78, 42, 87, 38, 92, 36, 94, 37, 93, 42, 89, 46, 83, 53, 76, 57, 65, 60, 53, 62, 43, 61, 36, 58, 32, 52, 30, 48, 32, 43, 34, 41, 38, 43, 38, 44}, false);
        c.setColor(Colors.turtleGreen);
        drawShapes(x, y, new int[] {62, 61, 66, 67, 63, 71, 60, 76, 59, 79, 61, 84, 65, 82, 71, 81, 79, 79, 85, 78, 89, 76, 93, 71, 96, 66, 98, 60, 96, 54, 94, 48, 94, 43, 94, 40, 89, 47, 85, 50, 80, 53, 74, 56, 69, 58, 64, 60, 62, 61}, true);
        c.setColor(Colors.turtleGreen);
        drawShapes(x, y, new int[] {31, 51, 23, 57, 15, 60, 7, 60, 4, 62, 3, 66, 5, 71, 12, 74, 19, 77, 28, 77, 36, 77, 45, 75, 52, 71, 59, 66, 62, 62, 56, 61, 47, 61, 39, 59, 33, 54, 31, 51}, true);
        c.setColor(Colors.turtleGreen);
        drawShapes(x, y, new int[] {131, 38, 132, 45, 130, 49, 129, 53, 131, 55, 132, 58, 137, 57, 142, 55, 143, 51, 145, 48, 144, 44, 142, 39, 140, 36, 135, 36, 132, 38, 131, 38}, true);
        c.setColor(Colors.turtleGreen);
        c.fillOval(93+x, 25+y, 40, 40);
        c.setColor(Colors.black);
        c.drawOval(93+x, 25+y, 40, 40);
        c.fillOval(104+x, 48+y, 5, 5);
        c.fillOval(119+x, 44+y, 5, 5);
        c.drawArc(105+x,41+y,15,15,260, 70);
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
}
