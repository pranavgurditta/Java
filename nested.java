/*Write a program to show the use of nested try statements that emphasizes the sequence of checking for catch handler statements. */

import java.util.*;
class nested
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        try
        {
            int b=100/n;
            System.out.println("number entered is "+n);
            try
            {
                if(n==1 )
                    n=n/(n-n);//inner try does not have a handler of arithmetc exception hence outer try handles it
                if(n==2)
                {
                    int c[]={1,2};
                    c[56]=99;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds "+e);}
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0 "+e);}
        catch(Exception e){/*if this exception object is placed before arithmetic
            exception then arithmetic exception will not be able to catch an exception as it would be 
            a;ready caught by the exception class object */
            System.out.println("General exception ");}

    }
}
