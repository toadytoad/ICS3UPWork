package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This is the whale which appears in the 1st and last scene
 */
import hsa.Console;

public class Whale {
    Console c;
    public Whale(Console c){
        this.c = c;
    }
    public void draw(int x, int y){
        c.setColor(Colors.oceanBlue);
        c.fillRect(x, y, 370, 200);
        c.setColor(Colors.whaleGray);
        drawShapes(x, y, new int[] {3, 44, 4, 61, 5, 77, 9, 92, 19, 107, 32, 123, 44, 136, 60, 145, 75, 153, 90, 159, 103, 162, 113, 164, 121, 167, 133, 167, 145, 167, 152, 166, 160, 166, 169, 165, 178, 163, 191, 159, 205, 157, 221, 152, 236, 146, 256, 136, 270, 124, 280, 112, 290, 100, 298, 88, 306, 72, 309, 67, 312, 67, 316, 66, 319, 66, 319, 62, 318, 59, 316, 56, 313, 52, 312, 49, 303, 58, 292, 61, 277, 62, 258, 59, 235, 56, 212, 51, 181, 49, 152, 36, 137, 27, 119, 20, 91, 5, 74, 1, 64, 1, 56, 1, 49, 1, 43, 3, 36, 7, 28, 13, 15, 25, 5, 39, 3, 49, 4, 77}, true);
        c.setColor(Colors.whaleGray);
        drawShapes(x, y, new int[] {312, 52, 316, 59, 319, 65, 329, 75, 339, 79, 349, 84, 360, 83, 365, 81, 367, 79, 368, 76, 365, 73, 357, 68, 352, 64, 346, 59, 338, 55, 333, 53, 338, 47, 347, 40, 353, 34, 360, 25, 365, 12, 362, 4, 356, 2, 345, 4, 337, 10, 329, 17, 323, 26, 317, 41, 312, 51}, true);
        c.setColor(Colors.whaleGray);
        drawShapes(x, y, new int[]  {99, 165, 103, 174, 110, 182, 117, 188, 123, 193, 126, 194, 124, 188, 120, 179, 119, 172, 119, 167, 99, 164}, true);
        c.setColor(Colors.whaleGray);
        drawShapes(x, y, new int[] {128, 133, 134, 156, 140, 168, 151, 180, 162, 186, 177, 192, 187, 195, 192, 195, 185, 189, 176, 179, 170, 168, 162, 155, 157, 146, 152, 133, 149, 129, 128, 133}, true);
        drawPseudoCurvedLines(x, y, new int[]{5, 45, 11, 42, 16, 41, 21, 41, 26, 41, 29, 43, 32, 44, 37, 47, 41, 51, 45, 54, 50, 55, 53, 57, 63, 62, 72, 63, 80, 64, 88, 66, 97, 67, 108, 67});
        c.setColor(Colors.white);
        c.fillOval(x+110, y+50, 15, 15);
        c.setColor(Colors.black);
        c.drawOval(x+110, y+50, 15,15);
        c.fillOval(x+114, y+54, 7, 7);
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
    private void drawPseudoCurvedLines(int x, int y, int[] arr){
        for(int i = 0; i<arr.length-2; i+=2){
            c.drawLine(arr[i]+x, arr[i+1]+y, arr[i+2]+x, arr[i+3]+y);
        }
    }
}
