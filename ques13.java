/*Write a program to show the use of static functions and to pass variable length arguments in a function.*/ 
import java.util.Scanner;
class ques13
{
      static void pt(int ... v)
      {
          //variable length arguments
        System.out.println("Number of arguments = "+v.length);
          for(int x:v)
          System.out.println(x);
        }
        public static void main(String args[])
        {//pt is a static function hence called without an object reference
            
            pt(1);
            
            pt(12,22,33);
            pt();
        }
    }
