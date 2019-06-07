/* To learn use of in case of a two dimensional array*/
import java.util.*;
class ques4
{
    static Scanner sc=new Scanner(System.in);
    int arr[][]; int r,c;
    ques4()
    {
        System.out.println("enter the dimensions of  the array in row *column form");
        r=sc.nextInt();
        c=sc.nextInt();
        arr=new int[r][c];
    }

    public static void main(String[] args)
    {
        ques4 obj=new ques4();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<obj.r;i++)
        {
            for(int k=0;k<obj.c;k++)
            {

                obj.arr[i][k]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array are");
        for(int i=0;i<obj.r;i++)
        {
            for(int k=0;k<obj.c;k++)
            {

                System.out.print(obj.arr[i][k]+"  ");
            }
            System.out.println();
        }

    }
}
