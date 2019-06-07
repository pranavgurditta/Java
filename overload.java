/* Write a program to show that during function overloading, if no matching argument is found,
then java will apply automatic type conversions(from lower to higher data type) */
import java.util.*;
class overload
{
    double f(double n1)
    {
        return(n1*n1);
    }

    int f(int n1,int n2)
    {
        return(n1*n2);
    }

    public static void main(String args[])
    {
        overload obj=new overload();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose square has to be calculated");
        System.out.println("Square of number entered is "+obj.f(sc.nextInt()));
    }
}
