import java.awt.*;
import javax.swing.*;
public class java_gui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("demo");
        frame.setSize(new Dimension(300,200));
        frame.setLocation(100,100);
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.green);
        JLabel label = new JLabel("HERE IS A LABEL");
        contentPane.add(label, BorderLayout.NORTH);
        JButton button = new JButton("BUTTON");
//        button.addActionListener();
        contentPane.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);

    }
}
