/* Write a program to demonstrate different mouse handling events like mouseClicked(), mouseEntered(), mouseExited(), mousePressed, mouseReleased() and mouseDragged(). */ 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "ques27" width=300 height=200>
</applet>
*/
public class ques27 extends Applet implements MouseListener, MouseMotionListener
{
String msg="";
int mouseX=0;
int mouseY=0;

public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
setForeground(Color.green);
setBackground(Color.blue);
}

public void mouseClicked(MouseEvent e)
{
mouseX=0;
mouseY=10;
msg="Mouse Clicked.";
repaint();

}
public void mouseEntered(MouseEvent e)
{
mouseX=0;
mouseY=10;
msg="Mouse Entered.";
repaint();
}
public void mouseExited(MouseEvent e)
{
mouseX=0;
mouseY=10;
msg="Mouse Exited.";
repaint();
}
public void mousePressed(MouseEvent e)
{
mouseX=e.getX();
mouseY=e.getY();
msg="Down";
repaint();
}
public void mouseReleased(MouseEvent e)
{
mouseX=e.getX();
mouseY=e.getY();
msg="Up";
repaint();
}
public void mouseDragged(MouseEvent e)
{
mouseX=e.getX();
mouseY=e.getY();
msg="*";
showStatus("Dragging mouse at "+mouseX+","+mouseY);
repaint();
}
public void mouseMoved(MouseEvent e)
{
mouseX=e.getX();
mouseY=e.getY();
showStatus("Dragging mouse at "+mouseX+","+mouseY);

}

public void paint(Graphics g)
{
g.drawString(msg,0,10);
}
}
