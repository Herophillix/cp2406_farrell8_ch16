import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JChangeSizeAndColorPanel implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;

    JLabel label;
    JButton button;
    int xPos;
    int yPos;

    int count = 0;

    public JChangeSizeAndColorPanel() {
        frame = new JFrame();
        frame.setTitle("JChangeSizeAndColorPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(null);

        xPos = 0;
        yPos = 200;

        label = new JLabel("This is some text");
        label.setBounds(xPos, yPos, 300, 200);
        frame.add(label);

        button = new JButton("Click me");
        button.setBounds(0,0, 200, 100);
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JChangeSizeAndColorPanel instance = new JChangeSizeAndColorPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            ++count;
            if(count == 3)
                button.setEnabled(false);
            AdjustFont();
        }
    }

    private void AdjustFont()
    {
        Font currentFont = label.getFont();
        label.setFont(new Font(currentFont.getName(), Font.PLAIN, currentFont.getSize() - 2));
        xPos += 20;
        yPos += 20;
        label.setBounds(xPos, yPos, 300, 200);
    }
}