/* Write a program that creates a Banner and then creates a thread to scrolls the message in the banner from left to right across the applet’s window. */
import java.awt.*;
import java.applet.*;
/*
<applet code="banner" width=300 height=400
</applet>
*/
public class banner extends Applet implements Runnable
{
    String msg="My name is Pranav ";
    Thread t=null;
    int state;
    boolean flag;
    public void init()
    {
        setBackground(Color.red);
        setForeground(Color.green);
    }
    public void start()
    {
        t=new Thread(this);
        flag=false;
        t.start();
    }
public void run()
{
    for(;;)
    {
        try{
            repaint();
            Thread.sleep(250);
            if(flag)
            break;
        }
        catch(InterruptedException e){}
    }
        
    }

public void stop()

{
    flag=true;
    t=null;
}
public void paint(Graphics g)
{
    char ch;
    ch=msg.charAt(0);
    msg=msg.substring(1,msg.length());
    msg+=ch;
    g.drawString(msg,50,30);
}

}
