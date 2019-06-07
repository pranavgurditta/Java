/* Write a program to get the URL/location of code (i.e. java code) and document(i.e. html file) */
import java.awt.*;
import java.applet.*;
import java.net.*;
/* <applet code="ques26" width=300 height=100>
 </applet>
 */
public class ques26 extends Applet
{
    public void paint(Graphics g)
    {
        String msg;
        URL u=getCodeBase();
        msg=" CodeBase is "+u.toString();
        g.drawString(msg,10,20);
     u=getDocumentBase();
     msg="Document Base is "+u.toString();
     g.drawString(msg,10,60);
    }
}
