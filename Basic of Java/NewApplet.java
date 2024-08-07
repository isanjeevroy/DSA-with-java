import java.applet.Applet;

import java.awt.*;
import java.awt.event.*;

public class NewApplet extends Applet implements MouseListener, MouseMotionListener {
    int x = 0, y = 0;
    String str = "";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(str, 100, 100);
    }

    public void mouseEntered(MouseEvent ae) {
        showStatus("Mouse Entered");
    }

    public void mouseExited(MouseEvent ae) {
        showStatus("Mouse Exited");
    }

    public void mousePressed(MouseEvent ae) {
        showStatus("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent ae) {
        showStatus("Mouse Released");
    }

    public void mouseMoved(MouseEvent ae) {
        str = "mouse moved";
        repaint();
    }

    public void mouseDragged(MouseEvent ae){  //str="mouse dragged"; //repaint();  showStatus("Mouse Dragged"); }  public void mouseClicked(MouseEvent ae){  showStatus("Mouse Clicked");   }class mouseEvent {
    
}
