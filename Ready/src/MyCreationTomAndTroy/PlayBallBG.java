package MyCreationTomAndTroy;
/*
Tom and Troy
Ms. Krasteva
2021/11/19
This stores the background of the first scene
 */
import hsa.Console;

public class PlayBallBG {
    Console c;
    public PlayBallBG(Console c){
        this.c = c;
    }

    public void draw(){
        c.setColor(Colors.sand);
        drawShapes(new int[] {0, 440, 473, 440, 590, 371, 641, 270, 641, 501, 0, 501, -1, 440}, true);
        c.setColor(Colors.oceanBlue);
        drawShapes(new int[] {0, 440, 473, 440, 590, 371, 641, 270, 641, -1, -1, -1, -1, 440}, false);
        c.setColor(Colors.coralOrange);
        drawShapes(new int[]{47, 440, 47, 435, 46, 431, 44, 430, 41, 430, 38, 430, 37, 428, 39, 427, 41, 427, 43, 427, 47, 429, 49, 428, 49, 426, 45, 424, 42, 424, 40, 422, 41, 420, 43, 420, 47, 420, 51, 423, 54, 425, 57, 423, 55, 421, 52, 421, 51, 419, 51, 418, 51, 418, 55, 417, 56, 418, 59, 419, 60, 421, 60, 423, 64, 424, 66, 422, 63, 420, 61, 420, 60, 417, 61, 415, 63, 415, 64, 415, 69, 420, 69, 422, 69, 425, 68, 427, 70, 427, 73, 426, 72, 424, 71, 422, 70, 419, 72, 419, 74, 420, 76, 423, 76, 426, 74, 429, 72, 431, 70, 435, 70, 440, 47, 440}, false);
        c.setColor(Colors.coralPink);
        drawShapes(new int[]{91, 440, 92, 431, 95, 426, 99, 424, 104, 424, 109, 424, 113, 425, 116, 429, 116, 433, 115, 441, 91, 440}, false);
        c.setColor(Colors.orchid);
        drawShapes(new int[]{79, 433, 84, 435, 90, 434, 96, 433, 95, 429, 91, 428, 87, 428, 83, 427, 79, 427, 79, 429, 78, 433}, false);
        c.setColor(Colors.orchid);
        drawShapes(new int[] {102, 428, 106, 428, 108, 425, 107, 413, 106, 411, 103, 410, 101, 412, 100, 416, 100, 424, 102, 428}, false);
        c.setColor(Colors.orchid);
        drawShapes(new int[]{113, 431, 115, 434, 121, 433, 125, 433, 129, 431, 131, 429, 127, 428, 122, 428, 116, 428, 113, 429, 113, 431}, false);
        c.setColor(Colors.coralSalmon);
        drawShapes(new int[] {143, 440, 143, 435, 144, 432, 145, 429, 148, 426, 151, 425, 155, 425, 158, 425, 163, 425, 167, 426, 172, 432, 168, 435, 167, 441, 143, 440}, false);
        c.setColor(Colors.maroon);
        drawShapes(new int[]{146, 430, 152, 430, 152, 427, 152, 424, 151, 417, 149, 414, 146, 417, 145, 424, 146, 430}, false);
        drawShapes(new int[]{154, 428, 160, 429, 162, 427, 162, 424, 160, 416, 158, 413, 156, 414, 156, 418, 155, 421, 154, 424, 154, 428}, false);
        drawShapes(new int[]{164, 431, 169, 432, 170, 429, 171, 426, 169, 420, 169, 418, 167, 416, 164, 419, 164, 422, 163, 425, 163, 429, 164, 431}, false );
        c.setColor(Colors.coralOrange);
        drawShapes(new int[]{297, 441, 296, 432, 298, 430, 301, 429, 305, 428, 308, 427, 311, 427, 314, 428, 316, 428, 318, 428, 322, 429, 322, 433, 322, 441, 297, 441}, false);
        c.setColor(Colors.orchid);
        drawShapes(new int[] {306, 430, 313, 431, 315, 428, 312, 416, 310, 414, 307, 416, 307, 420, 306, 427, 306, 430}, false);
        drawShapes(new int[]{317, 431, 324, 433, 325, 431, 326, 419, 324, 417, 322, 418, 319, 422, 318, 426, 317, 431}, false);
        drawShapes(new int[]{297, 433, 304, 431, 304, 429, 298, 417, 295, 417, 295, 427, 297, 433}, false);
        c.setColor(Colors.coralSalmon);
        drawShapes(new int[]  {335, 441, 334, 432, 342, 428, 349, 427, 356, 429, 360, 431, 361, 434, 362, 441, 335, 441}, false);
        c.setColor(Colors.coralPink);
        drawShapes(new int[]{383, 441, 383, 431, 385, 428, 388, 427, 391, 428, 393, 431, 395, 433, 395, 441, 383, 441}, false);
        c.setColor(Colors.pink);
        drawShapes(new int[] {385, 431, 382, 434, 378, 431, 382, 427, 385, 431}, false);
        drawShapes(new int[] {386, 429, 382, 426, 385, 423, 388, 426, 386, 429}, false);
        drawShapes(new int[]{392, 422, 395, 426, 391, 429, 388, 426, 392, 422}, false);
        drawShapes(new int[]{395, 433, 392, 430, 396, 426, 399, 430, 395, 433}, false);
    }

    private void drawShapes(int[] arr, boolean drawOutline) {
        int[] xPoints;
        int[] yPoints;
        xPoints = new int[arr.length/2];
        yPoints = new int[arr.length/2];
        for(int i = 0; i<arr.length/2; i++){
            xPoints[i] = arr[2*i];
            yPoints[i] = arr[2*i+1];
        }
        c.fillPolygon(xPoints, yPoints, xPoints.length);
        if(drawOutline) {
            c.setColor(Colors.black);
            c.drawPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}
