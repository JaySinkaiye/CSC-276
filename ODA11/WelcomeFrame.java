package ODA11;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.io.File;

public class WelcomeFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome Frame");
        frame.setLayout(new BorderLayout());

        JPanel westPanel = new JPanel( new GridLayout(2,1));
        JButton WestButton1 = new JButton("West 1");
        JButton WestButton2 = new JButton("West 2");

        WestButton1.setIcon(new ImageIcon("UM.png"));
        WestButton2.setIcon(new ImageIcon("MSU.png"));

        westPanel.add(WestButton1);
        westPanel.add(WestButton2);

        frame.add(westPanel, BorderLayout.WEST);

        JPanel EastPanel = new JPanel( new GridLayout(2,1));
        JButton EastButton1 = new JButton("East 1");
        JButton EastButton2 = new JButton("East 2");

        EastPanel.add(EastButton1);
        EastPanel.add(EastButton2);

        frame.add(EastPanel, BorderLayout.EAST);

        JPanel SouthPanel = new JPanel( new GridLayout(2,1));
        JButton SouthButton1 = new JButton("South 1");
        JButton SouthButton2 = new JButton("South 2");

        SouthPanel.add(SouthButton1);
        SouthPanel.add(SouthButton2);

        frame.add(SouthPanel, BorderLayout.SOUTH);

        JOptionPane.showMessageDialog(null, "Welcome to the Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        File imageCheck = new File("UM.png");

        if(imageCheck.exists()) 
            System.out.println("Image file found!");
        else 
            System.out.println("Image file not found!");

    }

}
