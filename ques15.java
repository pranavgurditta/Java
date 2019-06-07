/*Create a multi-file program where in one file a string message is taken as input from the user and the function to display the 
 * message on the screen is given in another file (make use of Scanner package in this program). */ 
import java.util.*;
class ques15
{
    String s;
    Scanner sc=new Scanner(System.in);
   public void getstring()
   {
       System.out.println("Enter the string");
    s=sc.nextLine();
}
}
class ques15partb
{
    public static void main(String args[])
    {
        ques15 ob=new ques15();
        ob.getstring();
        System.out.println("The string entered is \n"+ob.s);
    }
}
