import java.awt.*;
import javax.swing.*;

public class Dashboard1 {
    JFrame frameObj;

    // constructor
    Dashboard1() {
        frameObj = new JFrame();
        
        

        // setting the grid layout
        // a 2 * 3 grid is created with the horizontal gap 20
        // and vertical gap 25
        frameObj.setLayout(new GridLayout(2, 3, 30, 50));

        // creating 6 buttons
        JButton btn1 = new JButton("Books Available");
        JButton btn2 = new JButton("Staff Details");
        JButton btn3 = new JButton("Add books");
        JButton btn4 = new JButton("Add Staff");
        JButton btn5 = new JButton("Remove Books");
        JButton btn6 = new JButton("Remove Staff");

        // adding buttons to the frame
        frameObj.add(btn1);
        frameObj.add(btn2);
        frameObj.add(btn3);
        frameObj.add(btn4);
        frameObj.add(btn5);
        frameObj.add(btn6);

        frameObj.setSize(, 300);
        frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameObj.setVisible(true);
    }

    // main method
    public static void main(String[] args) {
        Dashboard1 dashboard1 = new Dashboard1();
    }
}
