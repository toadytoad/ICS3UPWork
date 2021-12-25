/*
  11/1/2021
  Troy Saldanha-Martins
  Tom Philip
  Ms. Krasteva
  This program will create a bead loom from first nations peoples.
 */

import hsa.Console;

import java.awt.*;

public class TomAndTroyBeadLoom {
    /**
     * The console in which the graphics will be displayed
     */
    Console c;
    /**
     * An array used to store some colors which will be used to create some gradients
     */
    Color[] colors;
    /**
     * A better shade of blue for the purpose of this project
     */
    Color blue;

    /**
     * Constructor which initializes all the class variables
     */
    public TomAndTroyBeadLoom(){
        c = new Console(26, 63,"Virtual Bead Loom");
        blue = new Color(85, 132, 255);
        colors = new Color[]{Color.RED, new Color(255, 128, 0), Color.YELLOW, blue};
    }

    /**
     * Introduction method. Displays the title, authors, and description of the bead loom to the user.
     */
    public void intro(){
        c.setFont(new Font("Book Antiqua", Font.BOLD, 24));
        c.drawString("Virtual Bead Loom", 150, 100);
        c.drawString("By: Tom and Troy", 160, 150);

        c.setFont(new Font("Book Antiqua", Font.PLAIN, 16));
        c.drawString("The design was created by Mi'kmaq bead artist Carrie Lynn Brake ", 10, 200);
        c.drawString("in Newfoundland. In Newfoundland, the court system decided to", 10, 220);
        c.drawString("introduce eagle feathers to provincial courts to take an", 10, 240);
        c.drawString("affirmation or oath instead of using the Bible. Brake was given", 10, 260);
        c.drawString("the opportunity to design and produce a bead work inspired by", 10, 280 );
        c.drawString("an eagle feather, and that's what she did. The eagle feather is", 10, 300);
        c.drawString("scared in some Indigenous cultures often being used in traditional", 10, 320);
        c.drawString("ceremonies. Brake said it allow her to tie in a little part of", 10, 340);
        c.drawString("history and her Indigenous roots to bring a part of Indigenous", 10, 360);
        c.drawString("culture into courtrooms. She designed this to bring back culture", 10, 380);
        c.drawString("along with a modern twist as well. The bead work was created to", 10, 400);
        c.drawString("be a set of earrings. All in all, this eagle feather design was", 10, 420);
        c.drawString("to establish that Mi'kmaq have a presence and exist within the", 10, 440);
        c.drawString("borders of Newfoundland.",10,460);

        c.setFont(new Font("Book Antiqua", Font.PLAIN, 14));
        c.drawString("Press any key to continue.", 300, 488);


        c.getChar();
        c.clear();
    }
    /**
     * This method draws a square in the coordinate system for this loom. The coordinate system goes as follows:
     * The row is 1 indexed and indicates the y coordinate.
     * The column is 1 indexed and indicates the position of the square in the row.
     * A point going right or left is an increase or decrease in column value.
     * A point going down and to the left, or up and to the right is an increase or decrease in row value.
     * A point going down and to the right, or up and to the left is an increase or decrease in both row and column values.
     *
     * @param row is the row of the coordinate system
     * @param column the position in that row
     * @param color the color of the square
     * @throws InterruptedException throws this exception for Thread.sleep()
     */
    private void drawSquare(int row, int column, Color color) throws InterruptedException{
        c.setColor(color);
        c.fillRect(252-row*7+14*(column-1),14*row-13, 14, 14);
        Thread.sleep(10);
    }

    /**
     * This method draws a 6 square triangle consisting of 3 triangles, 2 triangles, and 1 triangle.
     *
     * @param row is the row position of the tip of the triangle
     * @param column is the column position of the tip of the triangle
     * @param color is the color of the triangle
     * @throws InterruptedException  throws this exception for Thread.sleep() in drawSquare()
     */
    private void drawTriangle(int row, int column, Color color) throws InterruptedException{
        for(int y = 1; y<=3; y++){
            for(int x = 1; x<=y; x++){
                drawSquare(row+y-1, column+x-1, color);
            }
        }
    }

    /**
     * This method draws the same triangle as in drawTriangle(int row, int column, Color color) except it is made upside down
     *
     * @param row is the row position of the tip of the triangle
     * @param column is the column position of the tip of the triangle
     * @param color is the color of the triangle
     * @param yesNo this boolean is used for overloading the method to make the triangle upside down
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    private void drawTriangle(int row, int column, Color color, boolean yesNo) throws InterruptedException{
        for(int y = 1; y<=3; y++){
            for(int x = 1; x<=y; x++){
                drawSquare(row-y+1, column-x+1, color);
            }
        }
    }

    /**
     * This method creates the black triangle border of the bead loom.
     * It uses a for loop which iterates the tips of the triangles and draws them there.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void drawBlackBorder() throws  InterruptedException{
        for(int y = 5; y<=17; y+=3){
            drawTriangle(y,1,Color.black);
            drawTriangle(y,y,Color.black);
            drawTriangle(37-y+1,20-y,Color.black, true);
            drawTriangle(37-y+1, 19, Color.black, true);
        }
    }
    /**
     * This method creates the next set of blue triangles within the black triangles.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void drawBlueBorder() throws InterruptedException{
        for(int y = 7; y<=19; y+=3){
            drawTriangle(y, 4, blue, true);
            drawTriangle(y, y-3, blue, true);
            drawTriangle(38-y, 16, blue);
            drawTriangle(38-y, 23-y, blue);
        }
    }

    /**
     * This method fills in a sort of background which will be annoying to create if done later after a few more features have been created.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void fillBlue() throws InterruptedException{
        for(int y = 1; y<=5; y++){
            for(int x = 5; x<=y+11; x++){
                drawSquare(y+14,x,blue);
                drawSquare(24-y, 20-x, blue);
            }
        }
    }

    /**
     * This method draws the black rhombus in the centre of the bead loom.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void drawMiddleRhombus() throws InterruptedException{
        drawTriangle(17,9,Color.BLACK);
        drawTriangle(21, 11, Color.BLACK, true);
    }

    /**
     * This method draws the two big black triangles and then puts 3 dots of different colors on top.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void drawBigTriangles() throws InterruptedException{
        drawTriangle(9, 5, Color.BLACK);
        drawTriangle(12, 5, Color.BLACK);
        drawTriangle(12, 8, Color.BLACK);
        drawTriangle(13, 7, Color.BLACK, true);

        drawTriangle(29,15,Color.BLACK,true);
        drawTriangle(26,15,Color.BLACK, true);
        drawTriangle(26,12, Color.BLACK, true);
        drawTriangle(25, 13, Color.BLACK);

        for(int y = 1; y<=3; y++){
            drawSquare(2*y+7, (2*y+7)/2+1, colors[y-1]);
            drawSquare(31-2*y, (31-2*y)/2+1, colors[y-1]);
        }
    }

    /**
     * This method draws the lines which are near the center colored red, orange, and yellow.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void drawLines() throws InterruptedException{
        for(int y = 1; y<=3; y++){
            for(int x = 1; x<=3; x++) {
                drawSquare(15 + y, 4+x, colors[y - 1]);
                drawSquare(15+y,  y-x+12, colors[y-1]);
                drawSquare(19+y, y-x+8, colors[3-y]);
                drawSquare(19+y, 12+x, colors[3-y]);
            }
        }
    }

    /**
     * This method draws the little black dots that appear in the middle line of the bead loom.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void drawMiddleLine() throws InterruptedException{
        for(int x = 5; x<=15; x+=2){
            drawSquare(19,x,Color.BLACK);
        }
    }

    /**
     * This method draws the rainbow-like colors on the ends of the bead looms.
     *
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public void drawEnds() throws InterruptedException{
        for(int i = 1; i<=4; i++){
            for(int x = 1; x<=i; x++){
                drawSquare(x+i-1, x, colors[i-1]);
                drawSquare(38-(x+i-1),20-i, colors[i-1]);
            }
            for(int x = i; x>=1; x--){
                drawSquare(x+i-1,i, colors[i-1]);
                drawSquare(38-(x+i-1), 20-x, colors[i-1]);
            }
        }
    }

    /**
     * Main method.
     *
     * @param args main method arguments
     * @throws InterruptedException throws this exception for Thread.sleep() in drawSquare()
     */
    public static void main(String[] args) throws InterruptedException {
        TomAndTroyBeadLoom t= new TomAndTroyBeadLoom();
        t.intro();
        t.drawBlackBorder();
        t.drawBlueBorder();
        t.fillBlue();
        t.drawMiddleRhombus();
        t.drawBigTriangles();
        t.drawLines();
        t.drawMiddleLine();
        t.drawEnds();
    }
}