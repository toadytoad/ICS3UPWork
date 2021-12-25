package Test2;

import hsa.Console;

public class Main {
    public static void main(String[] args){
        Console a = new Console(12, "Console A");
        Console b = new Console(12, "Console B");
        b.print("Hello World from console B!");
        a.print("Hello World from console A!");
    }
}