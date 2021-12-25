import java.io.*;
/*
Tom Philip
Ms. Krasteva
2021/12/13
This program will read strings from a file and output them to another file in reverse order. (Exercise 19 Part 2)
 */
public class Exercise19P2TomPhilip {
    String[] in;
    BufferedReader br;
    PrintWriter pw;
    public Exercise19P2TomPhilip(){
        in = new String[5];
    }
    public void getData() throws IOException{
        br = new BufferedReader(new FileReader("dataIn.txt"));
        for(int i = 0; i<5; i++){
            in[i] = br.readLine();
        }
    }
    public void writeData() throws IOException {
        pw = new PrintWriter(new FileWriter("dataOut.txt"));
        for(int i = 4; i>=0; i--){
            pw.println(in[i]);
        }
        pw.close();
    }
    public static void main(String[] args) throws IOException{
        Exercise19P2TomPhilip e = new Exercise19P2TomPhilip();
        e.getData();
        e.writeData();
    }


}
