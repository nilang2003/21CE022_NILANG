//Question 1 Answer
//THIS QUESTION IS ANSWERED BY NILANG DAVE 21CE022.
/*This question asks to create a default,parameterised constructor and to create methods for calculating area
and perimeter. */
import java.util.Scanner;
public class circle
{
    double radius;

    circle()//creating default constructor
    {
        radius=1;
    }

    circle(double r)//creating parameterised constructor
    {
        radius=r;
    }

    void getArea()//defining the area method
    {
        double area=3.14*radius*radius;
        System.out.println("The area of the circle is:"+area);
    }

    void  getPerimeter()//defining the perimeter method
    {
        double perimeter=2*3.14*radius;
        System.out.println("The perimeter of the circle is:"+perimeter);
    }

    public static void main(String[] args)
    {
        circle c1=new circle();//calling the default constructor

        Scanner s= new Scanner(System.in);//calling the parameterised constructor
        System.out.println("Enter the radii of the circle:");
        double a= s.nextInt();
        circle c2=new circle(a);

       c2.getArea();//calling the method for calculating the area
       c2.getPerimeter();//calling the method for calculating the perimeter 
    } 
}