import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateDesktopWindow {
    public static void main(String[] args) {

        JFrame jFrame=new JFrame("My Window");
        JButton jButton=new JButton("Click Me");
        // setting Size of window
        jFrame.setSize(500,500);
        // setting frame Layout
        jFrame.setLayout(new FlowLayout());
//Add action listener to button
        jButton.addActionListener((e)-> {
                System.out.println("Button Click");
                JOptionPane.showMessageDialog(null,"Hay,Button Click");

        });

        //Add button in frame
        jFrame.add(jButton);
        //setDefaultCloseOperation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make window visible
        jFrame.setVisible(true);
    }
}
