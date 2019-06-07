/* To check if a number is prime or not, by taking the number as input from the keyboard*/
import java.util.*;
class prime
{
    boolean pri(int n)
    {
        for(int i=2;i<=(n/2);i++)
        {
            if(n%i==0)
                return(false);
        }
        return(true);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        prime obj=new prime();
        System.out.println("Enter the number to check if prime or not ");
        int n=sc.nextInt();
        if(obj.pri(n)==true)
            System.out.println(n+" is a prime number");

        if(obj.pri(n)==false)
            System.out.println(n+" is not  a prime number");
    }
}
