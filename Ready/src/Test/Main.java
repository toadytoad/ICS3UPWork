package Test;

import hsa.Console;
import java.io.*;

//PLEASE REMOVE THIS COMMENT WHEN YOU HAVE READ THE README!
public class Main {
    public static void main(String[] args) {
        Console c = new Console();

        //Please delete this code and the text.txt file if everything works!
        try {
            File file = new File("./Test/test.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            c.println("Your working directory is set up correctly!");
        } catch (Exception e) {
            c.println("Your working directory is NOT set up correctly, or you have deleted the text.txt file. Please read the README!");
        }
    }
}
