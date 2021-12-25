package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This is the static jellyfish that appears in some scenes
 */
import hsa.Console;

public class Jellyfish {
    Console c;
    public Jellyfish(Console c){
        this.c=c;
    }
    public void draw(int x, int y){
        c.setColor(Colors.oceanBlue);
        c.fillRect(x, y, 80, 99);
        c.setColor(Colors.pink);
        drawShapes(x, y, new int[]{2, 38, 4, 45, 9, 53, 13, 57, 25, 52, 33, 49, 42, 45, 52, 40, 61, 36, 62, 33, 56, 19, 49, 11, 42, 5, 34, 3, 24, 3, 15, 8, 8, 15, 1, 26}, true);
        c.setColor(Colors.coralPink);
        drawPseudoCurvedLines(x, y, new int[]{21, 51, 19, 61, 19, 68, 22, 74, 29, 81, 33, 88, 36, 98});
        drawPseudoCurvedLines(x, y, new int[]{34, 46, 31, 57, 33, 64, 36, 73, 41, 78, 45, 84, 46, 88, 46, 92, 47, 97});
        drawPseudoCurvedLines(x, y, new int[]{39, 45, 51, 51, 55, 55, 56, 64, 57, 69, 59, 76, 63, 79, 67, 85, 70, 86});
        drawPseudoCurvedLines(x, y, new int[]{48, 40, 57, 43, 63, 50, 63, 54, 64, 61, 66, 68, 70, 73, 75, 76, 78, 80, 80, 81});
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
