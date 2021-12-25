import hsa.Console;
import hsa.Message;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
Tom Philip
Ms. Krasteva
2021/12/13
This program will take a maximum of 20 numbers from the user and put them in a file in reversed order.
 */
public class Exercise20P3TomPhilip {
    Console c;
    double[] nums;
    public Exercise20P3TomPhilip(){
	c = new Console("Number logger");
    }
    public void getAndStoreInput(){
	int total;
	c.print("Please enter the amount of numbers you would like to store (maximum 20):");
	while(true){
	    String input = c.readLine();
	    try{
		total = Integer.parseInt(input);
		if(!(total>0&&total<=20)){
		    throw new NumberFormatException();
		}
		break;
	    } catch(NumberFormatException e){
		c.setCursor(1, 73);
		c.print("", 7);
		c.setCursor(1,73);
		new Message("Invalid input, please enter a number between 1 and 20");
	    }
	}
	nums = new double[total];
	c.println("Please input "+total+" numbers");
	for(int i = 0; i<total; i++){

	    while(true){
		String input = c.readLine();
		try {
		    double num = Double.parseDouble(input);
		    nums[i] = num;
		    break;
		} catch(NumberFormatException e){
		    c.setCursor(i+3, 1);
		    c.print("", 80);
		    c.setCursor(i+3, 1);
		    new Message("Invalid input, please enter a double.");
		}
	    }
	}
    }
    public void displayInput() throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("dataOut.txt"));
		for (int i = nums.length - 1; i >= 0; i--) {
			pw.println(nums[i]);
		}
		pw.close();
	}
    public static void main(String[] args) throws IOException{
	Exercise20P3TomPhilip e = new Exercise20P3TomPhilip();
	e.getAndStoreInput();
	e.displayInput();
    }
}
