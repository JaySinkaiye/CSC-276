package ODA12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{

    private  JTextField textField1;
    private  JTextField textField2;
    private JButton calButton;
    private  JLabel label;


    Calculator(){
        textField1 = new JTextField(5);
        textField2 = new JTextField(5);
        calButton = new JButton("Caculate");
        label = new JLabel("Sum: ");

        calButton.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(new JLabel("Enter Your First Number: "));
        this.add(textField1);
        this.add(new JLabel("Enter Your Second Number: "));
        this.add(textField2);
        this.add(calButton);
        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
    
            int sum = num1 + num2;
    
            label.setText("Sum: " + sum);            
        } catch (NumberFormatException u) {
            label.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
