/* To find the sum of any number of integers interactively, i.e., entering every number from the
keyboard, whereas the total number of integers is given as a command line argument. */
import java.util.*;
class ques7
{
    public static void main(String [] args)
    {
        int sum=0;
        int n=(Integer.parseInt(args[0]));
        n=n-1;
        Scanner sc=new Scanner(System.in);
        while(n>=0)
        {
            System.out.println("Enter the number which has to be added.");
            sum=sum+(sc.nextInt());
            n--;

        }
        System.out.println("The sum is "+sum);
    }

}
