/*Write a program to create your own exception types to handle situation specific to your application (Hint: Define a subclass of Exception which itself is a subclass of Throwable)*/
class PranavException extends Exception
{
    String msg;
    PranavException(String m)
    {
        msg=m;
    }

    public String toString()
    {

        return(msg+"- This is not the name of the coder of this program.");
    }
}
