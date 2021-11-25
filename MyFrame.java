import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    Timer timer = new Timer();
    private TimerTask task;

    MyFrame(){


        task = new TimerTask(){
            int counter = 20;
            
            public void run(){
                if(counter>0){
                    counter--;
                }
                else{
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);

        JButton button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setText("");

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            
        }
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
}