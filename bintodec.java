/*5. To convert a decimal to binary number*/
import java.util.*;
class bintodec
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which has to be converted to binary");
        int n=sc.nextInt();
        String s="";
        while(n>0)
        {
            s=s+(n%2);
            n=n/2;
        }
        StringBuffer sb=new StringBuffer(s);
        System.out.println("The binary equivalent of the number entered is "+sb.reverse());
    }
}
