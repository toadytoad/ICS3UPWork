
/*
09/24/2021
Tom Philip & Yi Song
Ms. Krasteva
This program is the solution to the problem in question 17.
 */
import hsa.Console;

public class TomPhilipYiSongJavaVars17 {
    //global variables
    Console c;
    int a;
    int b;
    int sum;
    public TomPhilipYiSongJavaVars17(){
        c = new Console();
    }
    public void userInput(){ //Gets the two numbers from the user
        a = c.readInt();
        b = c.readInt();
    }
    public void processing(){ //calculates the sum
        a--;
        sum = (b*b+b)/2-(a*a+a)/2;
    }
    public void output(){ //outputs the sum
        c.println(sum);
    }
    public static void main(String[] args){//main method
        TomPhilipYiSongJavaVars17 tomPhilipYiSongJavaVars17 = new TomPhilipYiSongJavaVars17();
        tomPhilipYiSongJavaVars17.userInput();
        tomPhilipYiSongJavaVars17.processing();
        tomPhilipYiSongJavaVars17.output();
    }
}
