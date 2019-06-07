/*8. Write a program that show working of different functions of String and StringBufferclasss like
setCharAt(), setLength(), append(), insert(), concat()and equals(). */
import java.io.*;
class q8
{

    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
        String s;
        StringBuffer sb;
        System.out.println("Enter a string ");
        s=br.readLine();
        System.out.println("The string you have entered is \n"+s);
        sb=new StringBuffer(s);
        sb.setCharAt(2,'e');
        System.out.println("The string after placing e on the third index is (using the setcharAt() function) \n"+sb);
        sb.setLength(6);

        System.out.println("The string after setting length to 6 is (using the setLength() function) \n"+sb);

        sb.append("  is a good boy ");
        System.out.println("The string after appending \" is a good boy \" (using the append() function)  is \n"+sb);
        sb.insert(7," paras ");
        System.out.println("The string after inserting paras at 7 th position is  (using the insert() function)  is \n"+sb);

        System.out.println("Enter the string to be appended to the string you entered previously (using concat()) \n");
        String k=br.readLine();
        System.out.println("The string after using concat is \n"+s.concat(k));
        System.out.println("Enter a string to compare with "+s);
        k=br.readLine();
        System.out.println("After using equals() the answer for equality is  \n"+s.equals(k));
    }

}
