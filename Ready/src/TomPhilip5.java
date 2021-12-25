import hsa.Console;

public class TomPhilip5 {
    Console c;
    String name;
    String teacherName;
    int age;
    public TomPhilip5(){
        c = new Console("Name, Teacher, and Age Questionnaire");
    }
    public void askData(){
        c.print("What is your name? ");
        name = c.readLine();
        c.println("Who is your teacher? ");
        teacherName = c.readLine();
        c.println("How old are you? ");
        age = c.readInt();
    }
    public void displayData(){
        c.println("So, "+name+", your teacher is " + teacherName + " and are you really " + age + " years old?");
    }
    public static void main(String[] args){
        TomPhilip5 t= new TomPhilip5();
        t.askData();
        t.displayData();
    }
}
