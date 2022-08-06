//QUESTION 3 ANSWER
//THIS QUESTION IS ANSWERED BY NILANG 21CE022.
//THIS FILE CONTAINS ALL THE ACCESSOR METHODS AND ALL THE OTHER METHODS.
/*This question asks to create an account class in which it gives services like bank,inquiry,withdraw,
depositing,transfer,creating new bank account and deactivating it. */

import java.util.*;
import java.util.Scanner;
public class account
{
    private int num;
    private int balance[]={300, 300, 300, 300, 300, 300, 300, 300, 300, 300};

    account(int i)
    {
        num=i;
    }

    public int balance(int n)
    {
        num=n;
       return balance[num];
    }
    public int deposit(int d)
    {
        balance[num]=d+balance[num];
        return balance[num];
    }

    public int withdraw(int w)
    {
        balance[num]=w-balance[num];
        return balance[num];
    }
}