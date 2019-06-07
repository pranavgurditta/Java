/* Write a program to demonstrate the concept of boxing and unboxing. */
import java.util.*;
class ques14
{
    int return5()
    {
        Integer n=5;

        return(n);//autounboxing 
    }

    void update()
    {
        Character c='a';
        c++;//autounboxing , updating and then autoboxing
        System.out.println("Updating a to b after autounboxing , updating and then autoboxing \n"+c);
    }

    public static void main(String args[])
    {
        ques14 obj=new ques14();
        System.out.println("Print 5 after autounboxing \n"+obj.return5());

        obj.update();
    }
}
