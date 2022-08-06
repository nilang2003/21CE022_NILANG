//Question 5 Answer
//THIS QUESTION IS ANSWERED BY NILANG DAVE 21CE022.
import java.util.Scanner;
public class que5 {
    //defining method 1
    void details(String d,int c)
    {
        String a=d;
        int b=c;
        
        System.out.println("Your name is:"+a);
        System.out.println("Your id number is:"+b);
    }

    //defining method 2
    void details(int e,int f,int g,int h)
    {
       int i=e;
       int j=f;
       int k=g;
       int l=h;

       System.out.println("Your marks in java is:"+i);
       System.out.println("Your marks in DCN is:"+j);
       System.out.println("Your marks in DE is:"+k);
       System.out.println("Your marks in Maths is:"+l);
    }

    public static void main(String[] args)
    {
           que5 q1=new que5();
           q1.details("Nilang", 22);
           q1.details(60, 52, 54, 55);
    }
    
}