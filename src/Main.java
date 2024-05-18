import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        /*TODO: im gonna give you a solo mission
            first, create a frame
            add a button to it
            make the button do something, like print to the console with System.out.println*/

        JFrame jframe = new JFrame();
        JButton jButton = new JButton("Click me");

        jframe.setSize(500,500);
        jframe.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked the button");
            }
        });

        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}