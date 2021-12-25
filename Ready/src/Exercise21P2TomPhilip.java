import hsa.Console;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
Tom Philip
Ms. Krasteva
2021/12/13
This program will get the dimensions of a grid and a range of numbers. It will then populate a grid with those dimension with random numbers withing that range.
 */
public class Exercise21P2TomPhilip {
    Console c;
    int[][] nums;
    int rangeLow;
    int rangeHigh;

    public Exercise21P2TomPhilip() {
        c = new Console("Random number grid populater");
    }

    public void getData() {
        c.print("Please input the side length of your grid: ");
        int dim = Integer.parseInt(c.readLine());
        nums = new int[dim][dim];
        c.print("Please input the range of your random numbers (inclusive,exclusive) separated by a comma: ");
        String[] line = c.readLine().split(",");
        rangeLow = Integer.parseInt(line[0]);
        rangeHigh = Integer.parseInt(line[1]);
    }

    public void populate() {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = rangeLow + (int) ((rangeHigh - rangeLow) * Math.random());
            }
        }
    }

    public void writeData() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("dataOut.txt"));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length - 1; j++) {
                pw.print(nums[i][j] + " ");
            }
            pw.println(nums[i][nums[0].length - 1]);
        }
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        Exercise21P2TomPhilip e = new Exercise21P2TomPhilip();
        e.getData();
        e.populate();
        e.writeData();
    }
}
