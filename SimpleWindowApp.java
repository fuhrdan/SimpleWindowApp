import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class SimpleWindowApp {

    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("Simple Window with Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel to hold buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3)); // Layout with one row and three columns

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Add panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
