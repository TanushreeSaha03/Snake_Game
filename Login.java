import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField textField;
    JButton rules, back;
    private int width = 800;
    private int height = 400;

    Login() {
        // Username label
        JLabel namelabel = new JLabel("Enter your Name");
        namelabel.setBounds(750, 300, 300, 85);
        namelabel.setFont(new Font("Arial", Font.BOLD, 30));
        namelabel.setForeground(Color.BLACK);
        add(namelabel);

        // Rules button
        rules = new JButton("Rules");
        rules.setBounds(740, 410, 120, 30);
        rules.setFont(new Font("Arial", Font.BOLD, 20));
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        // Back button
        back = new JButton("Back");
        back.setBounds(880, 410, 120, 30);
        back.setFont(new Font("Arial", Font.BOLD, 20));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        // Username text field
        textField = new JTextField();
        textField.setBounds(735, 360, 300, 30);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setBackground(new Color(255, 179, 0));
        add(textField);

        // Image label
        ImageIcon imageIcon = new ImageIcon("C:/Users/Tanushree/Desktop/SnakeGame/snake.png");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 600, 500);
        add(label);

        // Heading label
        JLabel heading = new JLabel("Welcome to Snake Game");
        heading.setBounds(450, 60, 700, 55);
        heading.setFont(new Font("Californian FB", Font.BOLD, 45));
        heading.setForeground(Color.BLACK);
        add(heading);

        // Set background color
        getContentPane().setBackground(new Color(109, 164, 170));
        setSize(width, height);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rules) {
            String name = textField.getText();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your name!");
            } else {
                setVisible(false);
                new Rules(name);
            }
        } else if (e.getSource() == back) {
            setVisible(false);
            JOptionPane.showMessageDialog(this, "Going back...");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}