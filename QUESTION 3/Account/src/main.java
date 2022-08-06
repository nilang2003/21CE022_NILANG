//HIS FILE CONTAINS THE MAIN METHOD AND MENU 
import java.util.*;
import java.util.Scanner;
public class main{
    public static void menu()
    {
        System.out.println("Enter 1 for bank inquiry.");
        System.out.println("Enter 2 for creating a new bank account.");
        System.out.println("Enter 3 for depositing money.");
        System.out.println("Enter 4 for withdrawing money.");
        System.out.println("Enter 5 for transfer.");
        System.out.println("Enter 6 for deactivating existing bank account.");
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        boolean correct=true;
        Scanner c= new Scanner(System.in);
        ArrayList<account> a=new ArrayList<account>();
       a.add(account(1,300));
       a.add(account(2,300));
       a.add(account(3,300));
       a.add(account(4,300));
       a.add(account(5,300));
       a.add(account(6,300));
       a.add(account(7,300));
       a.add(account(8,300));
       a.add(account(9,300));
       a.add(account(10,300));

       System.out.println("Please enter your Account number:");
       int num=c.nextInt();
       a.add(account(num,300));
       
       if(correct)
    {
       menu(); 
       int b=c.nextInt();
       switch(b)
       {
          case 1:
          System.out.println("Your bank balance is:"+a.get(num).balance(num));
          break;

          case 2:
          a.add(new account(11,300));
          System.out.println("Congratualations!Your new bank account is created successfully.");
          break;

          case 3:
          System.out.println("Your bank balance is:"+a.get(num).deposit(num));
          break;

          case 4:
          System.out.println("Your bank balance is:"+a.get(num).withdraw(num));
          break;

          case 5:
          System.out.println("Enter the account number you want to send money and also enter the amount:");
          int e=c.nextInt();
          int f=c.nextInt();
          if(a.get(num).balance(num)>f)
          {
            System.out.println("Congratulations!Money is transferred to "+e+"and amount is:"+f);
          }
          else
          {
            System.out.println("Money can not be transferred because of insufficient balance.");
          }
          break;

         case 6:
         a.remove(num);
         System.out.println("Thank you for using our services.");
         break;

         case 7:
         System.out.println("You have logout of your account successfully.");
         correct=false;
         break;

         default:
         System.out.println("Please enter correct number to avail the service.Try again.");
         break;

       }
    }
}

}