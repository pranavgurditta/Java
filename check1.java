
import java.util.*;
class check1
{
    static Scanner sc=new Scanner(System.in);
    void accept(String s)throws PranavException
    {

         
        if(!(s.equals("Pranav")))
            throw new PranavException(s);

         System.out.println("No exception caught , the name entered matches with the coder of the program.");
    }

    public static  void main(String args[])
    {
        check1 obj=new check1();
        String k;

        System.out.println("Enter the string to check if equal to the name of the coder or not");
        k=sc.nextLine();
        try
        {
            obj.accept(k);
        }
        catch(PranavException e){
            System.out.println("Caught "+e);}
    }
}
