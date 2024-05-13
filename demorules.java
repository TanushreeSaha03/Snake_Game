// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Rules extends JFrame implements ActionListener {

// String name;
// JButton start, back;

// Rules(String name) {
// this.name = name;
// getContentPane().setBackground(Color.WHITE);
// setLayout(null);

// JLabel heading = new JLabel("Welcome " + name + " to Snake Game");
// heading.setBounds(50, 20, 700, 55);
// heading.setFont(new Font("Californian FB", Font.BOLD, 35)); // Changed font
// to Californian FB and increased size
// heading.setForeground(Color.BLACK); // Changed text color to black
// add(heading);

// JLabel snakeRules = new JLabel("<html>" +
// "<ul>" +
// "<li><b>Objective:</b> Eat as much food as possible without colliding with
// the snake's body or the game boundaries.</li>"
// +
// "<li><b>Controls:</b> Use arrow keys or swipe gestures to control the
// direction of the snake. Avoid moving the snake backwards to prevent
// self-collisions.</li>"
// +
// "<li><b>Game Area:</b> Play within the bounded grid-based board. Food items
// and the snake move within this area.</li>"
// +
// "<li><b>Snake Movement:</b> Moves continuously in the current direction until
// directed otherwise. Cannot reverse direction to avoid self-collisions.</li>"
// +
// "<li><b>Food:</b> Randomly appears on the board. Eating food increases the
// snake's length by one segment.</li>"
// +
// "<li><b>Growth:</b> Snake grows longer with each food item eaten. Score
// increases with each food consumed.</li>"
// +
// "<li><b>Collision Detection:</b> Game ends if the snake collides with its own
// body or the game boundaries.</li>"
// +
// "<li><b>Game Over:</b> Display final score (number of food items eaten).
// Optionally, display the snake's length at the time of collision.</li>"
// +
// "<li><b>Difficulty Level:</b> Snake may speed up as the game progresses. Food
// spawn rate may decrease, increasing challenge.</li>"
// +
// "</ul>" +
// "</html>");
// snakeRules.setBounds(50, 110, 1200, 450);
// snakeRules.setFont(new Font("Tahoma", Font.PLAIN, 16));
// add(snakeRules);

// // Back button
// back = new JButton("Back");
// back.setBounds(250, 530, 100, 30);
// back.setFont(new Font("Arial", Font.BOLD, 20));
// back.setBackground(Color.BLUE);
// back.setForeground(Color.WHITE);
// back.addActionListener(this);
// add(back);

// start = new JButton("Start");
// start.setBounds(400, 530, 120, 30);
// start.setFont(new Font("Arial", Font.BOLD, 20));
// start.setBackground(Color.BLUE);
// start.setForeground(Color.WHITE);
// start.addActionListener(this);
// add(start);

// getContentPane().setBackground(new Color(109, 164, 170));

// setSize(800, 650);
// setLocation(350, 100);
// setVisible(true);
// }

// public void actionPerformed(ActionEvent e) {
// // TODO Auto-generated method stub
// if (e.getSource() == start) {
// setVisible(false);
// new App();

// } else {
// setVisible(false);
// new Login();
// }
// }

// public static void main(String[] args) {
// new Rules("User");
// }

// }