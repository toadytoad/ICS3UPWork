import hsa.Console;

import java.util.Locale;

public class TomPhilip11 implements Runnable{
    boolean dataAcquired = false;
    Console c;
    Double[] values = new Double[4]; // values are held as follows, D, V, T, A from index 0-3. If a value is not provided and needs to be solved for the value will be null. Using Double instead of double as primitives cannot be null.
    public TomPhilip11(){
        c = new Console();
    }
    public void intro(){
        while(true) {
            c.print("Welcome to my program! Would you like to [Q]uit or [S]tart: ");
            char response = c.readChar();
            if(response == 'Q' || response == 'q'){
                goodBye();
                break;
            }
            else if(response =='S'||response == 's'){
                askData();
                display();
                break;
            }
        }
    }

    public void goodBye(){
        c.clear();
        c.println("Thank you for using the program!");
        c.println("Press any key to exit");
        c.readChar();
        c.readChar();
        System.exit(0);
    }

    public void askData(){
        c.clear();
        boolean nullValue = false;
        c.println("If at any time you would like to restart the input phase, \ntype in r in any prompt.");
        c.println("If you do not know a variable and would like to solve for it, please input ?. \nA ? can only be inputted once and must be inputted");
        while(true){
            c.print("Please input the distance: ");
            String str = c.readLine().toUpperCase();
            if(str.equals("R")){
                askData();
                return;
            }
            else if(str.equals("?")&&!nullValue){
                values[0] = null;
                nullValue = true;
                break;
            }
            else{
                try{
                    double num = Double.parseDouble(str);
                    if(num<0){
                        throw new NumberFormatException();
                    }
                    values[0] = num;
                    break;
                } catch(NumberFormatException e){
                    c.println("Please make sure that your input a positive real number (decimals are allowed)");
                }
            }
        }
        while(true){
            c.print("Please input the velocity: ");
            String str = c.readLine().toUpperCase();
            if(str.equals("R")){
                askData();
                return;
            }
            else if(str.equals("?")){
                if(!nullValue) {
                    values[1] = null;
                    nullValue = true;
                    break;
                }
                else c.println("Unknown already provided, please provide a number or restart");
            }
            else{
                try{
                    double num = Double.parseDouble(str);
                    if(num<0){
                        throw new NumberFormatException();
                    }
                    values[1] = num;
                    break;
                } catch(NumberFormatException e){
                    c.println("Please make sure that your input a positive real number (decimals are allowed)");
                }
            }
        }
        while(true){
            c.print("Please input the time: ");
            String str = c.readLine().toUpperCase();
            if(str.equals("R")){
                askData();
                return;
            }
            else if(str.equals("?")){
                if(!nullValue) {
                    values[2] = null;
                    nullValue = true;
                    break;
                }
                else c.println("Unknown already provided, please provide a number or restart");
            }
            else{
                try{
                    double num = Double.parseDouble(str);
                    if(num<0){
                        throw new NumberFormatException();
                    }
                    values[2] = num;
                    break;
                } catch(NumberFormatException e){
                    c.println("Please make sure that your input a positive real number (decimals are allowed)");
                }
            }
        }
        while(true){
            c.print("Please input the acceleration: ");
            String str = c.readLine().toUpperCase();
            if(str.equals("R")){
                askData();
                return;
            }
            else if(str.equals("?")){
                if(!nullValue) {
                    values[3] = null;
                    nullValue = true;
                    break;
                }
                else c.println("Unknown already provided, please provide a number or restart");
            }
            else{
                try{
                    double num = Double.parseDouble(str);
                    if(num<0){
                        throw new NumberFormatException();
                    }
                    values[3] = num;
                    break;
                } catch(NumberFormatException e){
                    c.println("Please make sure that your input a positive real number (decimals are allowed)");
                }
            }
        }
        if(!nullValue){
            c.println("An unknown value was not given, please restart and provide the data, providing \none unknown[?]");
            c.println("Press any key to restart");
            c.readChar();
            askData();
        }
    }

    public void display(){
        String nulledValue = "";
        c.clear();
        c.println("Values provided were:\n");

        if(values[0]!=null)c.println("Distance: "+values[0]);
        else nulledValue = "distance";
        if(values[1]!=null)c.println("Velocity: "+values[1]);
        else nulledValue = "velocity";
        if(values[2]!=null)c.println("Time: "+values[2]);
        else nulledValue = "time";
        if(values[3]!=null)c.println("Acceleration: "+values[3]);
        else nulledValue = "acceleration";

        c.println();
        c.println();

        c.println("Solving for " + nulledValue);
        c.println();

        if(nulledValue.equals("distance")){
            c.println("D = "+values[1]+" * "+values[2] + " + 0.5 * " + values[3]+"^2 = "+ (values[1]*values[2]+0.5*values[3]*values[3]));
        }
        else if (nulledValue.equals("velocity")){
            c.println("V = (" + values[0] + " - 0.5 * "+values[3]+"^2) / " + values[2] + " = "+ ((values[0] - 0.5*values[3]*values[3])/values[2]));
        }else if (nulledValue.equals("time")){
            c.println("T = (" + values[0] + " - 0.5 * "+values[3]+"^2) / " + values[1] + " = "+ ((values[0] - 0.5*values[3]*values[3])/values[1]));
        } else if(nulledValue.equals("acceleration")){
            c.println("A = \u221A (2 * (" + values[0]+" - "+values[1] + " * " + values[2]+")) = " + (sqrt(2*(values[0]-values[1]*values[2]))));
        }

    }
    private double sqrt(double n){
        double result = 0;
        for(double i = 4294967296d; i>=2.328306436538696e-10d; i/=2){
            if((result+i)*(result+i)<=n) result+=i;
        }
        return result;
    }
    public static void main(String[] args){
        TomPhilip11 t = new TomPhilip11();
        t.intro();

    }
    //Animation
    @Override
    public void run() {

    }
}
