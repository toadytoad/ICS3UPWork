import java.io.*;
/*
Tom Philip
Ms. Krasteva
2021/12/13
This program will read strings from a file and put them into a different file where each character is separated by 10 spaces. (Exercise 19 Part 3)
 */
public class Exercise19P3TomPhilip {
    String[] in;
    BufferedReader br;
    PrintWriter pw;
    public Exercise19P3TomPhilip(){
        in = new String[5];
    }
    public void getData() throws IOException {
        br = new BufferedReader(new FileReader("Ready/src/dataIn.txt"));
        for(int i = 0; i<5; i++){
            in[i] = br.readLine();
        }
    }
    public void writeData() throws IOException {
        pw = new PrintWriter(new FileWriter("dataOut.txt"));
        for(int i = 0; i<5; i++){
            for(int j = 0; j<in[i].length(); j++){
                pw.print(in[i].charAt(j)+"          ");
            }
            pw.println();
        }
        pw.close();
    }
    public static void main(String[] args) throws IOException{
        Exercise19P3TomPhilip e = new Exercise19P3TomPhilip();
        e.getData();
        e.writeData();
    }
}
