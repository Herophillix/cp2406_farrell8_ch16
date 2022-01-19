import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;

    public JFontSizesPanel() {
        frame = new JFrame();
        frame.setTitle("JFontSizesPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new GridLayout(15, 1));

        for(int i = 6; i <= 20; ++i)
        {
            JLabel label = new JLabel();
            label.setText("Some phrase");
            label.setFont(new Font(label.getFont().getName(), Font.PLAIN, i));
            frame.add(label);
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFontSizesPanel instance = new JFontSizesPanel();
    }
}