import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import java.swing.*;

public class Soap_Dispenser {
    static Scanner keybaord = new Scanner(System.in);
    private static MyFrame myFrame;


    public Soap_Dispenser() {
    }


    public static void main(String[] args){

        setMyFrame(new MyFrame());

        Timer timer = new Timer();
        
        TimerTask task = new TimerTask(){


            int counter = 20;

            public void run(){
                if (counter>0) {
                    System.out.println(counter+ "seconds");
                    counter--;
                }
                else{
                    System.out.println("Task is compete");
                    timer.cancel();
                }
                
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);

}


    public static MyFrame getMyFrame() {
        return myFrame;
    }


    public static void setMyFrame(MyFrame myFrame) {
        Soap_Dispenser.myFrame = myFrame;
    }

} 
