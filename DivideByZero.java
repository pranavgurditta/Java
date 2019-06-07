/* Write a program “DivideByZero” that takes two numbers a and b as input, computes a/b, and invokes Arithmetic Exception to generate a message when the denominator is zero.*/

import java.util.*;
class DivideByZero
{
    int a,b ;
    Scanner sc=new Scanner(System.in);
    void d()
    {
        System.out.println("Enter a and b to do a/b");
        a=sc.nextInt();
        b=sc.nextInt();

        try{
            double k=a/b;
            System.out.println("The answer for division is "+k);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String args[])
    {
        DivideByZero obj=new DivideByZero();
        obj.d();
    }
}
