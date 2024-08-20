import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
public class Keyboard extends JFrame
{
    Keyboard()
    {

        JFrame frame =new JFrame();
        frame.setSize(300,300); 
        frame.setVisible(true);
        JLabel text=new JLabel();
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setVerticalAlignment(JLabel.CENTER);
        frame.add(text);
        frame.addKeyListener(new KeyListener)
        {
            public void keyTyped()
            {
                text.setText("KeyTyped");
            }
            public void keyReleased()
            {
                text.setText("KeyTyped");
                
            }
            public void keyPressed()
            {
                text.setText("KeyTyped");

            }

        }
    }
    public static void main(String[] args) 
    {
        newKeyboard();
    }
}
