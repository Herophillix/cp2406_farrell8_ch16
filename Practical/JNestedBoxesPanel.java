import javax.swing.*;
import java.awt.*;
public class JNestedBoxesPanel extends JPanel
{
   public static final int WINDOW_WIDTH = 500;
   public static final int WINDOW_HEIGHT = 500;

   int count;
   final int NUMBOXES = 8;
   final int INC = 20;
   int x;
   int y;
   int width, height;
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      width = 300;
      height = 300;
      x = 20;
      y = 20;
      for(count = 0; count < NUMBOXES; ++count)
      {
         gr.drawRect(x, y, width, height);
         x += INC; 
         y += INC;
         width -= INC * 2;
         height -= INC * 2;
      }     
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JNestedBoxesPanel());
      frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
