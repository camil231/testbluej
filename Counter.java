import javax.swing.*;
import java.awt.event.*;

public class Counter {
    public static void main() {
        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //bla
        JPanel panel = new JPanel();

        JLabel counterLabel = new JLabel("0");
        JButton incrementButton = new JButton("Add 1");
        incrementButton.addActionListener(new ActionListener() {
            int count = 0; 

            public void actionPerformed(ActionEvent e) {
                count++; 
                counterLabel.setText(Integer.toString(count)); // Update the label with the new value
            }
        });
        panel.add(incrementButton);
        panel.add(counterLabel);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
