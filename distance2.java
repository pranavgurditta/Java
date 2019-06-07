/* Modify the “distance” class by creating constructor for assigning values (feet and inches) to the
distance object. Create another object and assign second object as reference variable to another
object reference variable. Further create a third object which is a clone of the first object. */
import java.util.*;
class distance2
{
    static Scanner sc=new Scanner(System.in);
    double feet;
    double inches;
    double d;
    distance2(double x,double y )
    {
        this.feet=x;
        this.inches=y;

    }

    distance2(distance2 ob)
    {
        this.feet=ob.feet;
        this.inches=ob.inches;
    }

    
    void print()
    {
        System.out.println(this.feet+" feet "+this.inches+" inches");
    }

    public static void main()
    {
        System.out.println("Enter feet and inches for object 1   ");
        distance2 obj=new distance2(sc.nextInt(),sc.nextInt());
      System.out.println("Details of Object 1 are ");
        obj.print();
        System.out.println("Enter feet and inches for object 2 ");
        distance2 obj2=new distance2(sc.nextInt(),sc.nextInt());
     System.out.println("Details of object 2 are");
        obj2.print();
        System.out.println("object 3 assigned object 2's values");
        distance2 obj3=new distance2(obj2);
        obj3.print();
        distance2 obj4=obj;
        System.out.println("object 4 assigned object 1's values");
        obj4.print();
    }

}
