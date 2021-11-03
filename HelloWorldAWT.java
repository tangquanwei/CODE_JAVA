import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HelloWorldAWT {
    public static void main(String[] args) {
        new HelloWorldAWT().testSwing();
        Frame f = new Frame("AWT1");
        Label label = new Label("Hello!");
        f.add(label);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setSize(200, 200);
        f.setVisible(true);
    }
    public void testSwing(){
        
        JFrame frame = new JFrame("Swing");
        JLabel label = new JLabel("Hello Quanwei");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}