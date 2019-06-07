/* To learn use of single dimensional array by defining the array dynamically.*/

import java.util.*;
class check
{
    static Scanner sc=new Scanner(System.in);
    int arr[]; 
    check()
    {
        System.out.println("enter the number of elements of which you want the array");
        int n;
        n=sc.nextInt();
        arr=new int[n];
    }

    public static void main(String[] args)
    {
        check obj=new check();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<obj.arr.length;i++)
        {
            obj.arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are");
        for(int i=0;i<obj.arr.length;i++)
        {
            System.out.println(obj.arr[i]);
        }
    }
}
