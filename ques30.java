/*Write a program to demonstrate the use of push buttons.*/ 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="ques30" width=250 height=150>
</applet>
 */
public class ques30 extends Applet implements ActionListener 
{
    String msg = "";
    Button yes, no, maybe;
    public void init() 
    {
        msg="Delhi is the capital of India?";
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Maybe");
        add(yes);
        add(no);
        add(maybe);
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String str = ae.getActionCommand();
        if(str.equals("Yes")) 
        {
            msg = "You pressed Yes congratulations your answer is right.";
        }
        else if(str.equals("No")) 
        {
            msg = "You pressed No. Wrong Answer";
        }
        else {
            msg = "You pressed maybe , hurry up know this fact fast.";
        }
        repaint();
    }

    public void paint(Graphics g) 
    {
        g.drawString(msg, 6, 100);
    }
}
