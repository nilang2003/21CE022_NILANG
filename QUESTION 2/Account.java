//Question 2 Answer
//THIS QUESTION IS ANSWERED BY NILANG DAVE 21CE022.
/*This question asks to create a variables with default values using default constructor and user values using 
parameterised constructor and modified values accossor and mutator methods also create methods for monthly 
interest,withdraw and deposit*/

import java.util.*;
public class Account {
    //declaring the variables
    private int name_id;
    private double balance;
    private double anualinterestrate;
    private String datecreated;
    
    Account()//creating the default constructor
    {
        name_id=0;
        balance=500;
        anualinterestrate=0.07;
    }

    Account(int i,double b)//creating the parameterised constructor
    {
        name_id=i;
        balance=b;
    }

    //accessor method
    public int getname_id()
    {
        return this.name_id;
    }

    public double getbalance()
    {
        return this.balance;
    }

    public double getanualinterestrate()
    {
       return this.anualinterestrate;
    }

    public String getdatecreated()
    {
        return this.datecreated;
    }

    //mutator method
    public void setname_id()
    {
        this.name_id=name_id;
    }

    public void setbalance()
    {
        this.balance=balance;
    }

    public void setgetanualinterestrate()
    {
        this.anualinterestrate=anualinterestrate;
    }

    //declaring and defining the all the methods.

    void  getMonthlyInterestRate()//return function not executing
    {
        double getmonthlyinterestrate=(anualinterestrate/12);
        System.out.println(getmonthlyinterestrate);
    }

    void getMonthlyInterest()//return function not executing.
    {
        double getmonthlyinterest=(balance/12)*getmonthlyinterestrate;
        System.out.println(getmonthlyinterest);
    }

    void withdraw()//return function not executing
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter amount to be withdrawed from your bank account.");
        double w=s.nextDouble();
        System.out.println(w+" amount is withdrawed from your bank account.");
        System.out.println((balance-w)+" amount is left in your bank account.");
    }

    void deposit()//return function not executing
    {
       Scanner c=new Scanner(System.in);
       System.out.println("Enter amount to be deposited in your bank account.");
       double d=c.nextDouble();
       System.out.println(d+" amount is withdrawed from your bank account.");
       System.out.println((balance+d)+" amount is left in your bank account.");
    }

    public static void main(String[] args)
    {
        //defining a global scanner
        Scanner s= new Scanner(System.in);

        //calling all the methods using the default values only
        Account a1=new Account();
        a1.getMonthlyInterestRate();
        a1.getMonthlyInterest();

        System.out.println("Press 1 for withdraw and press 2 for deposit.");
        int a=s.nextInt();
        switch(a)
        {
            case 1:
            a1.withdraw();
            break;

            case 2:
            a1.deposit();
            break;
        }

        //calling all the methods using default methods but with accessor and mutator methods.
        Account a2=new Account();

        System.out.println("Enter the name_id:");
        int b=s.nextInt();
        a2.setname_id();
        System.out.println("The name_id is:"+a2.getname_id());
        
        System.out.println("Enter the balance::");
        double c=s.nextDouble();
        a2.setbalance();
        System.out.println("The balance is:"+a2.getbalance());

        System.out.println("Enter the anual interest rate:");
        double d=s.nextDouble();
        a2.setgetanualinterestrate();
        System.out.println("The anual interest is:"+a2.getanualinterestrate());

        //calling all the methods using the default methods but with accessor and mutator methods.
        a2.getMonthlyInterestRate();
        a2.getMonthlyInterest();

        System.out.println("Press 1 for withdraw and press 2 for deposit.");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            a2.withdraw();
            break;

            case 2:
            a2.deposit();
            break;
        }

        //calling all the methods using parameterised constructor.

        System.out.println("Enter the name_id:");
        int f=s.nextInt();

        System.out.println("Enter the balance::");
        double g=s.nextDouble();
        
        Account a3=new Account(f,g);

        System.out.println("Press 1 for withdraw and press 2 for deposit.");
        int h=s.nextInt();
        switch(h)
        {
            case 1:
            a3.withdraw();
            break;

            case 2:
            a3.deposit();
            break;
        }

    }
}
