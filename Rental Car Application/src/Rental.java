import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rental
{
  private static final int WIDTH = 1000;
  private static final int HEIGHT = 700;

//////////////////////////////////////////////////////////MAIN//////////////////////////////////////////
  public static void main(String[] args)
  {
    JFrame frame = new RentalView();
    ImageIcon img = new ImageIcon("C:\\Users\\aarti\\IdeaProjects\\Rental Car\\images\\logo.GIF");
    frame.setIconImage(img.getImage());
    frame.setTitle("Rental Car Application");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);
    frame.setResizable(false);
   }
}
